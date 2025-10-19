package com.xflprflx.poc_annotations.controllers;

import com.xflprflx.poc_annotations.mappers.UserMapper;
import com.xflprflx.poc_annotations.model.NewUserRequest;
import com.xflprflx.poc_annotations.model.User;
import com.xflprflx.poc_annotations.model.UserResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("/newUser")
    @Transactional
    public UserResponse createNewUser(@RequestBody @Valid NewUserRequest newUserRequest) {
        User user = requestToUser(newUserRequest);
//        User user = userMapper.toEntity(newUserRequest);
        entityManager.persist(user);
        return userMapper.toResponse(user);
    }

    @Deprecated
    private User requestToUser(NewUserRequest newUserRequest) {
        User user = new User();
        user.setUsername(newUserRequest.username());
        user.setEmail(newUserRequest.email());
        user.setPassword(newUserRequest.password());
        return user;
    }
}

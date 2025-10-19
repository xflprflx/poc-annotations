package com.xflprflx.poc_annotations.mappers;

import com.xflprflx.poc_annotations.model.NewUserRequest;
import com.xflprflx.poc_annotations.model.User;
import com.xflprflx.poc_annotations.model.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(NewUserRequest newUserRequest);
    UserResponse toResponse(User user);
}

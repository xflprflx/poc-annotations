package com.xflprflx.poc_annotations.model;

import java.util.List;

public class SuperUser extends User {
    private List<String> roles;

    public List<String> getRoles() {
        return roles;
    }
}

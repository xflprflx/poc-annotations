package com.xflprflx.poc_annotations.validation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@Repeatable(Roles.class)
public @interface Role {
}

package com.xflprflx.poc_annotations.validation;

import java.lang.annotation.Documented;

@Documented
public @interface ExemploDeAnnotation {
    String elementoA();
    String elementoB() default "";
    int[] elementosC() default {};
}

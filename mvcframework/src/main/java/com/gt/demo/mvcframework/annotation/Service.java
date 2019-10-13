package com.gt.demo.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author gt
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}

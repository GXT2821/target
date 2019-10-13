package com.gt.demo.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author gt
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}

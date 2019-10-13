package com.gt.demo.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author gt
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}

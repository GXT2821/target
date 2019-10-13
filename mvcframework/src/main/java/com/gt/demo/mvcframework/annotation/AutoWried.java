package com.gt.demo.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author gt
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoWried {
    String value() default "";
}

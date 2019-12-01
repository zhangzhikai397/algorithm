package com.huawei.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Documented
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DescFruit {
    String name();
    float price() default 0.0f;
    String desc();
}

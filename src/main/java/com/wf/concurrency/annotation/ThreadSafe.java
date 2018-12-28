package com.wf.concurrency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/12/28/028.
 * 用来标记【线程安全】的类
 */
@Target(ElementType.TYPE) //注解作用目标
@Retention(RetentionPolicy.SOURCE) //注解作用域
public @interface ThreadSafe {
    String value() default "";
}

package com.sczhaoqi.olap.modules.auth;

import javax.inject.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author sczhaoqi
 * @date 2019/8/14 22:48
 */
@Retention(RUNTIME)
@Target({FIELD, PARAMETER, METHOD})
@Qualifier
public @interface ForAuthority
{
}

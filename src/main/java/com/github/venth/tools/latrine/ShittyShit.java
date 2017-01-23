package com.github.venth.tools.latrine;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate anything you did to make your application work and it's
 * shitty.
 * Created on 20/01/2017.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.LOCAL_VARIABLE,
        ElementType.METHOD,
        ElementType.PACKAGE,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.TYPE_PARAMETER,
        ElementType.TYPE_USE
})
public @interface ShittyShit {

    /**
     * Author of annotated code
     */
    String author () default "";

    /**
     * Short explanation of annotated code
     */
    String value () default "This is shameful piece of code. " +
            "It's author is aware of it and plans to get rid of it.";
}

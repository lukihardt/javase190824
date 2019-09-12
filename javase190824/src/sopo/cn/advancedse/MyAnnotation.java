package sopo.cn.advancedse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotation{
	String color() default "blue";
	String value();
	int[] arrAttr() default {1, 2, 4};
	EnumTrafficLamp lamp() default EnumTrafficLamp.RED;
	MetaAnnotation annotationAttr() default @MetaAnnotation("cf");
}
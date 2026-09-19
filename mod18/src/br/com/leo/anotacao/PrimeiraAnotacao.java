package br.com.leo.anotacao;


import java.lang.annotation.*;
import java.lang.reflect.Field;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface PrimeiraAnotacao {

    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10d;


}

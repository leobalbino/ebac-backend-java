package br.com.leo.tarefamod18;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {

    String value();
}

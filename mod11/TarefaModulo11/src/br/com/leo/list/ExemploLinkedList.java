package br.com.leo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimpes();
        exemploListaSimpesOrdemAscendente();

    }

    private static void exemploListaSimpes() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Natalia Balbino");
        lista.add("Leonardo Balbino");
        lista.add("Ingrid Santos Silva");
        lista.add("Henrique Balbino");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimpesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<>();
        lista.add("Natalia Balbino");
        lista.add("Leonardo Balbino");
        lista.add("Ingrid Santos Silva");
        lista.add("Henrique Balbino");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}


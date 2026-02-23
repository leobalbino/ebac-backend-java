package br.com.leo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Natalia Balbino");
        lista.add("Leonardo Balbino");
        lista.add("Ingrid Santos Silva");
        lista.add("Henrique Balbino");
        System.out.println(lista);
        System.out.println("");
    }



    private static void exemploListaSimplesOrdemAscendente() {
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

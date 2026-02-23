package br.com.leo.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String entrada = s.nextLine();


        String[] nomesArray = entrada.split(",");

        List<String> listaNomes = new ArrayList<>();

        for (String nome : nomesArray) {
            listaNomes.add(nome.trim());
        }

        Collections.sort(listaNomes);

        System.out.println("\nNomes em ordem alfabetica:");
        System.out.println(listaNomes);

        s.close();
    }
}
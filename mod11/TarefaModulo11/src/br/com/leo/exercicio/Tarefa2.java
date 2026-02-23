package br.com.leo.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Listas para armazenar os grupos separadamente
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("--- Divisao por Genero ---");
        System.out.println("Digite Nome e Sexo (M/F) separados por traco e virgula.");
        System.out.println("Exemplo: Leonardo-H, Ingrid-M, Henrique-M, Natalia-F");

        String entrada = s.nextLine();

        String[] partes = entrada.split(",");

        for (String item : partes) {
            String[] dadosPessoa = item.trim().split("-");

            if (dadosPessoa.length == 2) {
                String nome = dadosPessoa[0].trim();
                String sexo = dadosPessoa[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                }
            }
        }

        System.out.println("\n=== Grupo Masculino ===");
        System.out.println(masculino);

        System.out.println("\n=== Grupo Feminino ===");
        System.out.println(feminino);

        s.close();
    }
}

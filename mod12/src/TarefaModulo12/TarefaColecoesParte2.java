package TarefaModulo12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoesParte2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Listas para separar os grupos
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (Ex: Leonardo-M, Ingrid-F):");
        String entrada = s.nextLine();

        // 1. Separa as pessoas pela vírgula
        String[] pessoas = entrada.split(",");

        for (String p : pessoas) {
            // 2. Separa o Nome do Sexo pelo traço
            String[] dados = p.trim().split("-");

            String nome = dados[0].trim();
            String sexo = dados[1].trim().toUpperCase();

            // 3. Lógica de agrupamento
            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            }
        }

        // 4. Impressão dos grupos
        System.out.println("\n--- Grupo Masculino ---");
        System.out.println(masculino);

        System.out.println("\n--- Grupo Feminino ---");
        System.out.println(feminino);

        s.close();
    }
}
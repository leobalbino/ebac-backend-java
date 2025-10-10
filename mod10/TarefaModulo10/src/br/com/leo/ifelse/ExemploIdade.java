package br.com.leo.ifelse;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5) {
            return "Voce e um bebe";
        } else if (idade >= 6 && idade <= 10) {
            return "Voce e uma crianca";
        } else if (idade >= 11 && idade <= 18) {
            return "Voce e adolescente";
        } else {
            return "Voce e adulto";
        }
    }
}

package br.com.leo.swichcase;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua dade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Voce e um bebe";
                break;
            case 6:
            case 10:
                result = "Voce e uma crianca";
                break;
            case 11:
            case 18:
                result = "Voce e adolescente";
                break;
            default:
                result = "Voce e adulto";
                break;
        }
        return result;
    }
}

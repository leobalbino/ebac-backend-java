package Exercicio;

import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = s.nextInt();
        String notaSt = getNota(nota);
        System.out.println(notaSt);
    }

    private static String getNota(int nota) {
        if (nota >=7) {
            return "Voce esta aprovado";
        } else if (nota >= 5 && nota < 7){
            return "Voce esta de recuperacao";
        } else {
            return "Voce esta reprovado";
        }
    }


}


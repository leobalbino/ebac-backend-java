package Exercicio;

import java.util.Scanner;

public class ExercicioSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = s.nextInt();
        String notaSt = getNota(nota);
        System.out.println(notaSt);
    }

    private static String getNota(int nota) {
        String result;
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                result = "Voce esta reprovado";
                break;
            case 5:
            case 6:
                result = "Voce esta de recuperacao";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                result = "Voce esta aprovado";
                break;
            default:
                result = "Nota invalida";
                break;
        }
        return result;
    }
}

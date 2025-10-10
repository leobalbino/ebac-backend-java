package br.com.leo.forewhile;

import java.util.Scanner;

public class ExemploPPT2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int contador=1; contador<=1000; contador++){
            System.out.println("Esta e a repeticao nr: "+contador);
            if (contador==10)
                break;
        }


    }

}

package br.com.leo.array;

public class ExemplosArray {

    public static void main(String[] args) {
        arrayBidimensional();

    }

    private static void arrayBidimensional() {
        System.out.println("***** arrayBidimensional *****");
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Valores no array1 passados na linha sao ");
        outputArray(array1);

        System.out.println("Valores no array1 passados na linha sao ");
        outputArray(array2);

    }

    private static void outputArray(int[][] array) {
        // FAZ UM LOOP PELAS LINHAS DO ARRAY

    }
}

package tarefaCalculoMedia;

public class CalculoMedia {


    public static void main(String[] args) {
        calcularMedia();
    }

    private static void calcularMedia() {
        double nota1 = 9;
        double nota2 = 7;
        double nota3 = 5;
        double nota4 = 8;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("a media da nota eh: "+ media);



    }
}

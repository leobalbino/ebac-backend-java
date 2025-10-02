public class Carro {

    // Propriedades

    String marca;
    String modelo;
    String cor;
    boolean ligado;

    // Metodos com acoes que o carro pode realizar

    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.println("O carro ligou");
        } else {
            System.out.println("O carro ja esta ligado");
        }
    }

    public void desligar(){
        if (ligado) {
            ligado =  false;
            System.out.println("O carro desligou");
        } else {
            System.out.println("O carro ja esta desligado");
        }
    }

    // Metodo para exibir o status do carro
    public void exibirStatus(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Nao"));
    }

}

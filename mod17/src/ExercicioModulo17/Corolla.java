package ExercicioModulo17;

public class Corolla extends Carro {

    public Corolla() {
        super("Toyota Corolla");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
    }
}
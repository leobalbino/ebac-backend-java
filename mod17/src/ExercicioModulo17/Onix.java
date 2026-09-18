package ExercicioModulo17;

public class Onix extends Carro {

    public Onix() {
     super("Chevrolet Onix");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
    }
}

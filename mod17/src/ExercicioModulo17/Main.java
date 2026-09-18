package ExercicioModulo17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Onix());
        carros.add(new Corolla());

        for (Carro carro : carros) {
            carro.exibirDetalhes();
        }

    }
}

package br.com.ebac.abstractfactory.fabrica;

import br.com.ebac.abstractfactory.carro.Sedan;
import br.com.ebac.abstractfactory.carro.SUV;

public interface FabricaCarro {

    Sedan criarSedan();

    SUV criarSUV();

}
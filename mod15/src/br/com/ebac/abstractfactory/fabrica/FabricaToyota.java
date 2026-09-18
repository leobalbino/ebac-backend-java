package br.com.ebac.abstractfactory.fabrica;


import br.com.ebac.abstractfactory.carro.Sedan;
import br.com.ebac.abstractfactory.carro.SUV;
import br.com.ebac.abstractfactory.toyota.Corolla;
import br.com.ebac.abstractfactory.toyota.CorollaCross;

public class FabricaToyota implements FabricaCarro {

    @Override
    public Sedan criarSedan() {
        return new Corolla();
    }

    @Override
    public SUV criarSUV() {
        return new CorollaCross();
    }
}

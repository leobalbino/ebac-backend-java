package br.com.ebac.abstractfactory.fabrica;


import br.com.ebac.abstractfactory.carro.Sedan;
import br.com.ebac.abstractfactory.carro.SUV;
import br.com.ebac.abstractfactory.honda.Civic;
import br.com.ebac.abstractfactory.honda.HRV;

public class FabricaHonda implements FabricaCarro {

    @Override
    public Sedan criarSedan() {
        return new Civic();
    }

    @Override
    public SUV criarSUV() {
        return new HRV();
    }
}
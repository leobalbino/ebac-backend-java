package br.com.ebac.abstractfactory.toyota;

import br.com.ebac.abstractfactory.carro.SUV;

public class CorollaCross implements SUV {

    @Override
    public void exibirInfo() {
        System.out.println("Toyota Corolla Cross - SUV");
    }
}
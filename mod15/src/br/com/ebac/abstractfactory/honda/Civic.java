package br.com.ebac.abstractfactory.honda;

import br.com.ebac.abstractfactory.carro.Sedan;

public class Civic implements Sedan {

    @Override
    public void exibirInfo() {
        System.out.println("Honda Civic - Sedan");
    }
}
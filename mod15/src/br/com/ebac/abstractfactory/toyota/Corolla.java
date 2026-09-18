package br.com.ebac.abstractfactory.toyota;

import br.com.ebac.abstractfactory.carro.Sedan;

public class Corolla implements Sedan {
    @Override
    public void exibirInfo() {
        System.out.println("Toyota Corolla - Sedan");
    }
}


package br.com.ebac.abstractfactory.honda;

import br.com.ebac.abstractfactory.carro.SUV;

public class HRV implements SUV {

    @Override
    public void exibirInfo() {
        System.out.println("Honda HR-V - SUV");
    }
}
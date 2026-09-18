package br.com.ebac.abstractfactory;

import br.com.ebac.abstractfactory.carro.Sedan;
import br.com.ebac.abstractfactory.carro.SUV;
import br.com.ebac.abstractfactory.fabrica.FabricaCarro;
import br.com.ebac.abstractfactory.fabrica.FabricaHonda;
import br.com.ebac.abstractfactory.fabrica.FabricaToyota;

public class Main {

    public static void main(String[] args) {

        FabricaCarro fabricaToyota = new FabricaToyota();

        Sedan sedanToyota = fabricaToyota.criarSedan();
        SUV suvToyota = fabricaToyota.criarSUV();

        sedanToyota.exibirInfo();
        suvToyota.exibirInfo();

        System.out.println("--------------------");

        FabricaCarro fabricaHonda = new FabricaHonda();

        Sedan sedanHonda = fabricaHonda.criarSedan();
        SUV suvHonda = fabricaHonda.criarSUV();

        sedanHonda.exibirInfo();
        suvHonda.exibirInfo();
    }
}
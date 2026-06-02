package br.com.leo.interfaces;

public class Caminhao implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro esta andando devagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhao parando");
    }
}

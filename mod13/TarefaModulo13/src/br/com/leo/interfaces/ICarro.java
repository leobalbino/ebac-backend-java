package br.com.leo.interfaces;

public interface ICarro {
    default void parar(){
        System.out.println("Carro esta parando");
    }

    public void andar();

}

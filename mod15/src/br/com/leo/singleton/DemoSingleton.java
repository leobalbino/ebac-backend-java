package br.com.leo.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}

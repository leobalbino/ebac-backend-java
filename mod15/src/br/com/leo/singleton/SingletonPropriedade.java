package br.com.leo.singleton;

public class SingletonPropriedade {

    private static SingletonPropriedade singleton;
    private static String value;

    private SingletonPropriedade(String value) {
        this.value = value;
    }

    public static SingletonPropriedade getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropriedade(value);
        }
        return singleton;
    }
}


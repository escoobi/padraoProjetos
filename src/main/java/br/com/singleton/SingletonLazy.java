package br.com.singleton;

/**
 * Singleton "Mod preguiçoso".
 * @author Gustavo Oliveira Cardozo
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

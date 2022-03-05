package br.com.singleton;

/**
 * Singleton "Mod apressado".
 *
 * @author Gustavo Oliveira Cardozo
 */
public class SingleEager {
    private static SingleEager instancia = new SingleEager();

    private SingleEager() {
    }

    public static SingleEager getInstancia() {
        return instancia;
    }
}

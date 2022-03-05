package br.com.singleton;

/**
 * Singleton "Mod Expert"
 *
 * @author Gustavo Oliveira Cardozo
 */
public class SingletonHolder {
    private static class InstanceHolder {
        public static SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder() {
    }

    public static SingletonHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

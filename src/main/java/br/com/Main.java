package br.com;

import br.com.facede.Facede;
import br.com.singleton.SingleEager;
import br.com.singleton.SingletonHolder;
import br.com.singleton.SingletonLazy;
import br.com.strategy.ComportamentoAgressivo;
import br.com.strategy.ComportamentoDefensivo;
import br.com.strategy.ComportamentoNormal;
import br.com.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        //singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingleEager eager = SingleEager.getInstancia();
        System.out.println(eager);
        eager = SingleEager.getInstancia();
        System.out.println(eager);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);

        //strategy

        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(comportamentoNormal);
        robo.mover();
        robo.mover();
        robo.setStrategy(comportamentoDefensivo);
        robo.mover();
        robo.mover();
        robo.setStrategy(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        //Facede

        Facede facede = new Facede();
        facede.migrarCliente("Gustavo", "76876628");


    }
}

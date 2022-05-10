package LabProjetosStrategy;

import LabProjetoFacade.Facade;
import LabProjetosPradaoJava.SingletonEager;
import LabProjetosPradaoJava.SingletonLazy;
import LabProjetosPradaoJava.SingletonLazyHolder;
import LabProjetosStrategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        eager =  SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        Comportamento normal =  new ComportamentoNormal();
        Comportamento defensivo =  new ComportamentoDefensivo();
        Comportamento agresivo =  new ComportamentoAgresivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.setStrategy(agresivo);
        robo.mover();
        robo.mover();

        Facade facade =  new Facade();
        facade.migrarCliente("Ravena", "435000");


    }
}

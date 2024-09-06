package fachada;

import estrategia.Estrategia;
import estrategia.EstrategiaA;
import singleton.Singleton;

public class Fachada {
    private Singleton singleton;
    private Estrategia estrategia;

    public Fachada() {
        singleton = Singleton.getInstancia();
        estrategia = new EstrategiaA();
    }

    public void executar() {
        singleton.imprimirMensagem();
        estrategia.executar();
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}

import fachada.Fachada;
import estrategia.EstrategiaB;

public class App {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        fachada.executar();

        fachada.setEstrategia(new EstrategiaB());
        fachada.executar();
    }
}

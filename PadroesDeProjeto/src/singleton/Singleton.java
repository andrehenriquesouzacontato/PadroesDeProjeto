package singleton;

public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void imprimirMensagem() {
        System.out.println("Mensagem do Singleton");
    }
}

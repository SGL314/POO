public class Contador{
    private int valor;

    int getValor(){return valor;}

    public synchronized void incrementar () {
        valor++;
    }
}

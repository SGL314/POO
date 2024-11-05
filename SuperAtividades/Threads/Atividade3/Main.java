import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
        Object mon = new Object();
        Pares pares = new Pares(mon);
        Impares impares = new Impares(mon);
        
        Thread th1 = new Thread(pares);
        Thread th2 = new Thread(impares);

        th1.start();
        th2.start();
    }
}

package Threads.Atividade2;

public class Main {
    public static void main(String[] args) {
        Pares pares = new Pares();
        Impares impares = new Impares();
        Thread th1 = new Thread(pares);
        Thread th2 = new Thread(impares);

        th1.start();
        th2.start();
    }
}

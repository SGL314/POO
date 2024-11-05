public class Incrementadora implements Runnable{
    private int n;
    private Contador contador;

    public Incrementadora(int n,Contador contador) {
        this.contador = contador;
        this.n = n;
    }
    
    public void run(){
        for (int i=0;i<100000;i++){
            this.contador.incrementar();
        }
        System.out.println("Thread "+this.n+" terminou de incrementar.");
    }
}



public class Pares implements Runnable {
    private Object monitor = null;

    public Pares(Object monitor){
        this.monitor = monitor;
    }

    public void run(){
        synchronized (this.monitor) {
            int teto = 7;
            for (int i=2;i<teto;i+=2){
                try{
                    this.monitor.notify();
                    System.out.print(i);
                    if (i==teto-1) return;
                    this.monitor.wait();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

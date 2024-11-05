

public class Impares implements Runnable {
    private Object monitor = null;

    public Impares(Object monitor){
        this.monitor = monitor;
    }

    public synchronized void run(){
        synchronized (this.monitor) {
            int teto = 7;
            for (int i=1;i<teto;i+=2){
                try{
                    this.monitor.notify();
                    System.out.print(i);
                    if (i==teto-2) return;
                    this.monitor.wait();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

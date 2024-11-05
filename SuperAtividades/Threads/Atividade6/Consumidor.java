

public class Consumidor implements Runnable{
    private final Teste place;
    private static int loop = 1;

    Consumidor(Teste place){
        this.place = place;
    }
    public void run(){
        while (true){
            try {
                if (this.place.filaVazia()) place.wait();
                this.place.consumir();
                Thread.sleep(101);
                place.notify();
            } catch (Exception e) {
            }
            Consumidor.loop++;
        }
    }
}

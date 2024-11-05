public class Produtor implements Runnable{
    private final Teste place;
    private static int loop = 1;

    Produtor(Teste place){
        this.place = place;
    }
    public void run(){
        while (true){
            try {
                if (this.place.filaCheia()) place.wait();
                this.place.produzir();
                Thread.sleep(100);
                place.notify();
            } catch (Exception e) {
            }
            Produtor.loop++;
        }
    }
}

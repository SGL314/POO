import java.util.LinkedList;
import java.util.Queue;

public class Teste{
    private Queue<Integer> fila = new LinkedList<>();
    public final int tamanho;
    private static int loop = 1;

    Teste(int qt){
        this.tamanho = qt;
        
        Produtor prod = new Produtor(this);
        Consumidor cons = new Consumidor(this);

        Thread th1 = new Thread(prod);
        Thread th2 = new Thread(cons);
        th1.start();
        //th2.start();

        
        try {
            int loop = 1;
            while (true){
                System.out.print("\rTamanho da Fila : "+this.getSize()+" loop : "+loop);
                Thread.sleep(50);
                loop++;
                if (loop == 50) th2.start();
            }
        } catch (Exception e) {
        }
    }

    public synchronized void consumir(){
        this.fila.poll();
    }

    public synchronized void produzir(){
        int valor = (int) (Math.random()*10);
        this.fila.add(valor);
    }

    public boolean filaVazia(){
        return fila.isEmpty();
    }

    public boolean filaCheia(){
        return fila.size() == this.tamanho;
    }

    public int getSize(){
        return fila.size();
    }


    

}

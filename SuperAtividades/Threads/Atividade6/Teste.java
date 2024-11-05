import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Teste{
    private Queue<Integer> fila = new LinkedList<>();
    public final int tamanho;
    private static int loop = 1;

    Teste(int qt){
        this.tamanho = qt;

        int qtP = (int) (Math.random()*5);
        int qtC = (int) (Math.random()*5);

        System.out.println(qtC+" "+qtP);
        ArrayList<Produtor> prods = new ArrayList<>();
        ArrayList<Consumidor> conss = new ArrayList<>();

        for (int i =0;i<qtP;i++){
            prods.add(new Produtor(this));
        }
        for (int i =0;i<qtC;i++){
            conss.add(new Consumidor(this));
        }
        
        ArrayList<Thread> ths = new ArrayList<>();
        System.out.println("1");
        for (Produtor prod : prods){
            ths.add(new Thread(prod));
        }
        System.out.println("2");
        for (Consumidor cons : conss){
            ths.add(new Thread(cons));
        }
        System.out.println("3");
        for (int i=1;i<=qtP;i++){
            ths.get(i-1).start();
        }
        System.out.println("4");

        
        try {
            int loop = 1;
            while (true){
                System.out.println("\033[H\033[2J");
                System.out.print("Tamanho da Fila : "+this.getSize()+"\nPs. : "+qtP+"\nCs. : "+qtC+"\nloop : "+loop);

                Thread.sleep(50);
                loop++;

                if (loop == 100){
                    for (int i=qtP+1;i<=qtP+qtC;i++){
                        ths.get(i-1).start();
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public synchronized void consumir(){
        this.fila.poll();
    }

    public synchronized void produzir(){
        int valor = (int) Math.random()*10;
        this.fila.add(valor);
    }

    public boolean filaVazia(){
        return fila.isEmpty();
    }

    public boolean filaCheia(){
        return fila.size() >= this.tamanho;
        // um notify notifica as vezes para mais de uma Produtora
    }

    public int getSize(){
        return fila.size();
    }


    

}

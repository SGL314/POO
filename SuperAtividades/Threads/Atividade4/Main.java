public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador();
        
        for (int i=1;i<=5;i++){
            Thread thr = new Thread(new Incrementadora(i,cont));
            thr.start();
            try{
                thr.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(cont.getValor());
    }
}

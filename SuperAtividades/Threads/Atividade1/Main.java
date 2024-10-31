
class Main{
    public static void main(String args[]){
        testes();
    }

    public static void testes(){
        TH1 teste = new TH1();
        Thread th1 = new Thread(teste);
        th1.start();
    }
}




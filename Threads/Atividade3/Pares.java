package Threads.Atividade3;

import java.util.Random;

public class Pares implements Runnable {
    public void run(){
        int teto = 1000000;
        Random r = new Random();
        for (int i=0;i<teto;i+=2){
            try{
                wait();
                System.out.println(i);
                notify();
            } catch(Exception e){

            }
        }
    }
}

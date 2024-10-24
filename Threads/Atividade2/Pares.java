package Threads.Atividade2;

import java.util.Random;

public class Pares implements Runnable {
    public void run(){
        int teto = 1000000;
        Random r = new Random();
        for (int i=0;i<teto;i+=2){
            System.out.println(i);
            try{
                Thread.sleep((int) (Math.random()*1000));
            } catch(Exception e){

            }
        }
    }
}

package Threads.Atividade2;

import java.util.Random;

public class Impares implements Runnable {
    public void run(){
        int teto = 1000000;
        Random r = new Random();
        for (int i=1;i<teto;i+=2){
            System.out.println(i);
            try{
                Thread.sleep((int) (Math.random()*1000));
            } catch(Exception e){

            }
        }
    }
}

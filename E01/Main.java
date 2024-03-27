package E01;
public class Main{
    public static void main(String[] args){
        Cliente objA = new Cliente();
        Cliente objB = new Cliente();

        objA.dono = "Lobato";
        objA.saldo = 2300;
        objA.agencia = "101-2";
        objA.numero = 314159265;

        objB.dono = "Lobato";
        objB.saldo = 2300;
        objB.agencia = "101-2";
        objB.numero = 314159265;

        if (objA == objB) {
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
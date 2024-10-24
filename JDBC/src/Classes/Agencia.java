package src.Classes;

import java.util.ArrayList;

class Agencia{
    final private int numero;
    private int numeroConta = 1;
    final private Banco banco;
    private ArrayList<Conta> contas = new ArrayList<>();

    Agencia(Banco banco,int numero){
        this.numero = numero;
        this.banco = banco;
    }

    private int numberCount(){
        numeroConta++;
        return numeroConta-1;
    }

    public Conta crateCount(){
        Conta novaConta = new Conta(this,numberCount());
        return novaConta;
    }
}







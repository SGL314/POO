package src.Classes;
import java.util.ArrayList;

class Banco{
    private int numeroAgencia = 1;
    final private String nome;
    private ArrayList<Agencia> agencias = new ArrayList<>();

    Banco(String nome){
        this.nome = nome;
    }

    private int numberAgency(){
        numeroAgencia++;
        return numeroAgencia-1;
    }
    public Agencia createAgency(){
        Agencia novaAgencia = new Agencia(this,numberAgency());
        agencias.add(novaAgencia);
        return novaAgencia;
    }
    // DAO : Data Acess Object

    // Get e Set

    String getNome(){
        return nome;
    }


}
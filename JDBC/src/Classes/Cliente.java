package src.Classes;
public class Cliente {
    final private String nome,cpf;

    Cliente(String nome,String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    // Get e Set

    String getNome(){
        return nome;
    }

    String getCpf(){
        return cpf;
    }


}

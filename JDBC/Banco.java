import java.util.ArrayList;

class Banco{
    private int numeroAgencia = 1;
    ArrayList<Agencia> agencias = new ArrayList<>();
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
}

import java.util.ArrayList;

public class Conta {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    final private Agencia agencia;
    final private int numero;

    Conta(Agencia agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    
}

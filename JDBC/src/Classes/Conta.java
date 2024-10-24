package src.Classes;

import java.util.ArrayList;

public class Conta {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    final private Agencia agencia;
    final private int numero;
    private float reserva=0;

    Conta(Agencia agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    // Funções

    public void putClient(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente createClient(){
        Cliente cliente = new Cliente("Cliente sem nome","123.456.789-00");
        clientes.add(cliente);
        return cliente;
    }

    // Get e Set

    float getReserva(){
        return reserva;
    }

    int getNumero(){
        return numero;
    }

    Agencia getAgencia(){
        return agencia;
    }
    
    
}

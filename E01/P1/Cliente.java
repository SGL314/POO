public class Cliente {
    int numero;
    double saldo;
    String dono;
    String agencia;

    boolean deposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    boolean saque(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    boolean transferir(Cliente destino, double valor){
        boolean saque = this.saque(valor);
        if (saque){
            boolean deposito = destino.deposito(valor);
            return deposito;
        }
        return false;
    }
}

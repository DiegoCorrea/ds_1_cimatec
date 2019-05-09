package aplicacaoconta;

/**
 *
 * @author lowe
 */
public abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract String tipoConta();
    
    public abstract void aplicarRendimento();
    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void imprimir(){
        System.out.println("Saldo: " + this.saldo);
    }
    
}

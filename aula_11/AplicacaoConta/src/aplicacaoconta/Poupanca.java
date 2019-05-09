package aplicacaoconta;

/**
 *
 * @author lowe
 */
public class Poupanca extends Conta{

    public Poupanca(double saldo) {
        super(saldo);
    }
    
    @Override
    public String tipoConta(){
        return "Poupanca";
    }
    
    @Override
    public void aplicarRendimento(){
        this.setSaldo(this.getSaldo() + (this.getSaldo()*0.5));
    }
}

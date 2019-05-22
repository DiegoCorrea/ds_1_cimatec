package aplicacaoconta;

/**
 *
 * @author lowe
 */
public class Investimento extends Conta {

    public Investimento(double saldo) {
        super(saldo);
    }
    
    @Override
    public String tipoConta(){
        return "Inestimento";
    }
    
    @Override
    public void aplicarRendimento(){
        this.setSaldo(this.getSaldo() + (this.getSaldo()*1.5));
    }

}

package aplicacaoconta;

/**
 *
 * @author lowe
 */
public class AplicacaoConta {
    public static void main(String[] args) {
        Poupanca p = new Poupanca(500.0);
        System.out.println("Tipo da Conta: " + p.tipoConta());
        System.out.println("Saldo: " + p.getSaldo());
        p.aplicarRendimento();
        System.out.println("Saldo depois do rendimento: " + p.getSaldo());
        Investimento i = new Investimento(1000.0);
        System.out.println("Tipo da Conta: " + i.tipoConta());
        System.out.println("Saldo: " +i.getSaldo());
        p.aplicarRendimento();
        System.out.println("Saldo depois do rendimento: " + p.getSaldo());
    }
}

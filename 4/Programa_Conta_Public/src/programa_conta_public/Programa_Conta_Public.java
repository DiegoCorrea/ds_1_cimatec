
package programa_conta_public;

public class Programa_Conta_Public {

    public static void main(String[] args) {
        // Criando a conta 1
        Conta minhaConta = new Conta();
        minhaConta.titular = "Brasil Laranjal";
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 2000.0;
        minhaConta.limiteFixo = 2000.0;
        minhaConta.numero = 123;
        // Saque
        double saque = 2000.0;
        boolean consegui = minhaConta.sacaValor(saque);
        System.out.println("-------------------------------------------");
        System.out.println("Sacar: " + saque);
        if (consegui == true) {
            System.out.println("Saque realizado com sucesso!");
            minhaConta.exibeSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque");
            minhaConta.exibeSaldo();
        }
        // Deposito
        System.out.println("-------------------------------------------");
        double deposito = 2000.0;
        for(int qtde = 0; qtde < 48; qtde++) {
            minhaConta.deposita(deposito);            
        }
        minhaConta.exibeSaldo();
        System.out.println("-------------------------------------------");
        // Criando a conta 1
        Conta motoristaConta = new Conta();
        motoristaConta.titular = "Sr. Motorista";
        motoristaConta.saldo = 98000.0;
        motoristaConta.limite = 2000.0;
        motoristaConta.limiteFixo = 2000.0;
        motoristaConta.numero = 171;
        System.out.println("-------------------------------------------");
        double transferir = 5000.0;
        motoristaConta.transferencia(minhaConta, transferir);
        motoristaConta.exibeSaldo();        
        System.out.println("-------------------------------------------");
        minhaConta.exibeSaldo();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoaplicacao;

/**
 *
 * @author lowe
 */
public class BancoAplicacao {
    private static final Banco DS_SA = new Banco("Banco Desenvolvimento de Sistemas S/A", 10);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoAplicacao.preencher_agencias();
        BancoAplicacao.preencher_banco();
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println("#################################################");
        BancoAplicacao.DS_SA.imprimirAgencias();
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println("#################################################");
        BancoAplicacao.DS_SA.imprimirContas();
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println("#################################################");
        BancoAplicacao.deletar_agencia();
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println("#################################################");
        BancoAplicacao.DS_SA.imprimirContas();
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println("#################################################");
        BancoAplicacao.DS_SA.imprimirAgencias();
    }
    
    public static void preencher_banco() {        
        Conta nova_conta = new Conta(1111, "valeska", 500.0);
        DS_SA.associarContaComAgencia(nova_conta, 999);
        Conta nova_conta_2 = new Conta(222, "Suzana", 500000.00, 1000000.00, 2);
        DS_SA.associarContaComAgencia(nova_conta_2, 666);
        Conta nova_conta_3 = new Conta(33333, "Ana Banana", 100.00, 100.00);
        DS_SA.associarContaComAgencia(nova_conta_3, 666);
    }
    
    public static void preencher_agencias() {
        Agencia nova_agencia_1 = new Agencia(666, 66);
        DS_SA.associarAgenciaAoBanco(nova_agencia_1);
        Agencia nova_agencia_2 = new Agencia(333, 10);
        DS_SA.associarAgenciaAoBanco(nova_agencia_2);
        Agencia nova_agencia_3 = new Agencia(999, 3);
        DS_SA.associarAgenciaAoBanco(nova_agencia_3);
    }
    
    public static void deletar_agencia() {
        DS_SA.deletarAgencia(666);
    }
    
}

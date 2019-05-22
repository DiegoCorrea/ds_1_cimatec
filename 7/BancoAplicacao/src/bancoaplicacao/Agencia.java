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
public class Agencia {
    private final int NUMERO;
    private final Conta[] contas;
    private int qtdeContas;
    
    Agencia(int numero, int maxQtdeContas){
        this.NUMERO = numero;
        this.contas = new Conta[maxQtdeContas];
        this.qtdeContas = 0;
    }
    
    public int getNumero() {
        return this.NUMERO;
    }
    
    public int getQtdeContas() {
        return this.qtdeContas;
    }
    
    public Boolean atribuirConta(Conta nova_conta) {
        if (this.qtdeContas < this.contas.length){
            this.contas[this.qtdeContas] = nova_conta;
            this.qtdeContas++;
            return true;
        }
        return false;
    }
    
    public void imprimirContas() {
        for(int i = 0; i < this.qtdeContas; i++) {
            this.contas[i].exibeInformacoes();
        }
    }
    
    public void exibeInformacoes(){
        System.out.println("****************************************************");
        System.out.println("Agência Número: " + this.NUMERO);
        System.out.println("Quantidade de Contas Criadas: " + this.qtdeContas);
        this.imprimirContas();
        System.out.println("****************************************************");
    }
    
}

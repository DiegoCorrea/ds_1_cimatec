/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoaplicacao;

import java.util.ArrayList;

/**
 *
 * @author lowe
 */
public class Agencia {
    private final int NUMERO;
    private final ArrayList<Conta> contas;
    
    Agencia(int numero, int maxQtdeContas){
        this.NUMERO = numero;
        this.contas = new ArrayList();
    }
    
    public int getNumero() {
        return this.NUMERO;
    }
    
    public int getQtdeContas() {
        return this.contas.size();
    }
    
    public Boolean atribuirConta(Conta nova_conta) {
        this.contas.add(nova_conta);
        return true;
    }
    
    public void imprimirContas() {
        this.contas.forEach((conta) -> conta.exibeInformacoes());
    }
    
    public void exibeInformacoes(){
        System.out.println("****************************************************");
        System.out.println("Agência Número: " + this.NUMERO);
        System.out.println("Quantidade de Contas Criadas: " + this.contas.size());
        this.imprimirContas();
        System.out.println("****************************************************");
    }
    
}

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
public class Banco {
    private final String NOME;
    private ArrayList<Conta> contas;
    private ArrayList<Agencia>  agencias;
    
    Banco(String nome, int maxQtdeContas) {
        this.NOME = nome;
        this.contas = new ArrayList();
        this.agencias = new ArrayList();
    }
    
    public String getNome() {
        return this.NOME;
    }
    
    public int getQtdeAgencias() {
        return this.agencias.size();
    }
    
    public int getQtdeContas() {
        return this.contas.size();
    }
    
    public void imprimirContas() {
       this.contas.forEach((conta) -> conta.exibeInformacoes());
    }
    
    public void imprimirAgencias() {
        this.agencias.forEach((agencia) -> agencia.exibeInformacoes());
    }
    
    public Boolean associarContaComAgencia(Conta nova_conta, int numero_agencia) {
        for(Agencia ag: this.agencias) {
            if(ag.getNumero() == numero_agencia){
                ag.atribuirConta(nova_conta);
                return true;
            }
        }
        return false;
    }
 
    public Boolean associarAgenciaAoBanco(Agencia agencia) {
        for(Agencia ag: this.agencias) {
            if(ag.getNumero() == agencia.getNumero()) return false;
        }
        this.agencias.add(agencia);
        return true;
    }
    
    public void deletarAgencia(int numero_agencia) {
        Agencia ag_to_delete = null;
        for(Agencia agencia: this.agencias) {
            if (agencia.getNumero() == numero_agencia) {
                System.out.println("##################### Deletando Agencia");
                agencia.exibeInformacoes();
                ag_to_delete = agencia;
            }
        }
        if (ag_to_delete != null)
            this.agencias.remove(ag_to_delete);
    }
    
}

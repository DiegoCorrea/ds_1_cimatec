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
public class Banco {
    private final String NOME;
    private final Conta[] contas;
    private Agencia[] agencias;
    private int qtdeContasCriadas;
    private int qtdeAgenciasCriadas;
    
    Banco(String nome, int maxQtdeContas) {
        this.NOME = nome;
        this.contas = new Conta[maxQtdeContas];
        this.agencias = new Agencia[maxQtdeContas];
        this.qtdeContasCriadas = 0;
        this.qtdeAgenciasCriadas = 0;
    }
    
    public String getNome() {
        return this.NOME;
    }
    
    public Boolean associarContaComAgencia(Conta nova_conta, int numero_agencia) {
        int i;
        for(i = 0; i < this.qtdeAgenciasCriadas && this.agencias[i].getNumero() != numero_agencia; i++){}
        if(this.agencias[i].getNumero() == numero_agencia && this.agencias[i].atribuirConta(nova_conta)) {
            this.contas[this.qtdeContasCriadas] = nova_conta;
            this.qtdeContasCriadas++;
            return true;
        }
        return false;
    }
 
    public Boolean associarAgenciaAoBanco(Agencia agencia) {
        int i;
        for(i = 0; i < this.qtdeAgenciasCriadas && this.agencias[i].getNumero() != agencia.getNumero(); i++){}
        if(this.qtdeAgenciasCriadas < this.agencias.length) {
            this.agencias[this.qtdeAgenciasCriadas] = agencia;
            this.qtdeAgenciasCriadas++;
            return true;
        }
        return false;
    }
    
    public void imprimirContas() {
        for(int i = 0; i < this.qtdeContasCriadas; i++) {
            this.contas[i].exibeInformacoes();
        }
    }
    
    public void imprimirAgencias() {
        for(int i = 0; i < this.qtdeAgenciasCriadas; i++) {
            this.agencias[i].exibeInformacoes();
        }
    }
    
    public void deletarAgencia(int numero_agencia) {
        Agencia[] nova_ordem_agencias;
        nova_ordem_agencias = new Agencia[this.agencias.length];
        for(int i = 0, j = 0; i < this.qtdeAgenciasCriadas; i++){
            if(this.agencias[i].getNumero() != numero_agencia){
                nova_ordem_agencias[j] = this.agencias[i];
                j++;
            }
        }
        this.agencias = nova_ordem_agencias;
        this.qtdeAgenciasCriadas--;
    }
    
}

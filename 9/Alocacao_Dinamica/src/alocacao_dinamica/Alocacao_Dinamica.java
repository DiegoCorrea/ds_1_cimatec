/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alocacao_dinamica;
import java.util.ArrayList;

/**
 *
 * @author lowe
 */
public class Alocacao_Dinamica {

    /**
     * @param args comandos vindos de fora do programa
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Manoel");
	lista.add("Joaquim");
	lista.add("Maria");
        lista.forEach((elemento) -> Alocacao_Dinamica.imprimirDadosFormatados(elemento));
        System.out.println("O tamanho da list é: " + lista.size());
        lista.add("Ana");
        lista.add("Carlos");
        lista.remove("Manoel");
        lista.forEach((elemento) -> Alocacao_Dinamica.imprimirDadosFormatados(elemento));
        System.out.println("O tamanho da list é: " + lista.size());        
    }
    
    /**
     * Recebe uma String e exibe na tela
     * @param  elemento  uma String
     * @see         
    */
    public static void imprimirDadosFormatados(String elemento) {
        System.out.println("Nome: " + elemento);
    }
    
}

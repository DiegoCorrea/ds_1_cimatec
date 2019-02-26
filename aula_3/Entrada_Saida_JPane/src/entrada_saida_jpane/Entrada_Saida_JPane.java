/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida_jpane;
import javax.swing.JOptionPane;
/**
 *
 * @author lowe
 */
public class Entrada_Saida_JPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Estamos iniciando o programa!");
        String primeiro_nome = JOptionPane.showInputDialog("Digite o Primeiro nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o Sobrenome: ");
        JOptionPane.showConfirmDialog(null,"Olá, " + primeiro_nome + " " + sobrenome + "!");

    }
    
}

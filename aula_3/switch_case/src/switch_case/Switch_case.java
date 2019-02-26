/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;

import javax.swing.JOptionPane;

/**
 *
 * @author lowe
 */
public class Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 4"));
        switch(numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "O primeiro número!");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "O segundo número!");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "O terceiro número!");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "O quarto número!");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Número não permitido");
                
        }
    }
    
}

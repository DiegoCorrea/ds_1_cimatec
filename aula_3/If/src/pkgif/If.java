/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import javax.swing.JOptionPane;

/**
 *
 * @author lowe
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null,"Você é maior de idade?");
        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "É maior de idade!");
        } else {
            JOptionPane.showMessageDialog(null, "Ainda é menor!");
        }
    }
    
}

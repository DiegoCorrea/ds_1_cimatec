/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_saida_terminal;
import java.util.Scanner;

/**
 *
 * @author lowe
 */
public class Entrada_Saida_Terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o nome: ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        System.out.println(inputString);
    }
    
}

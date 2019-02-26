/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

/**
 *
 * @author lowe
 */
public class Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 10;
        do {
            System.out.println(contador);
            contador--;
        }while(contador > 0);
    }
    
}

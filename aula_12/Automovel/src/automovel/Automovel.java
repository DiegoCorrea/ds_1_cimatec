/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovel;

/**
 *
 * @author lowe
 */
public class Automovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro("B-171", "Fusca Queiroz", "Famiglia Milicia", "Laranja", 1.7f, 1964);
        for(int i = 0; i < 10; i++){
            carro1.acelerar(i*10);
        }
        for(int i = 0; i < 10; i++){
            carro1.frear(i*10);
        }
        System.out.println("");
    }
    
}

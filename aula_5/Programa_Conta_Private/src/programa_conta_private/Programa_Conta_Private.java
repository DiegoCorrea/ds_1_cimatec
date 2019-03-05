/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_conta_private;

public class Programa_Conta_Private {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        
        Conta conta_estudante = new Conta(111, "Cleber", 100.00);
        conta_estudante.exibeInformacoes();
        Conta conta_especial = new Conta(222, "Suzana", 500000.00, 1000000.00, 2);
        conta_especial.exibeInformacoes();
        
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
    }    
}

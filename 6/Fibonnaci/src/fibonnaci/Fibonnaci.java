/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

/**
 *
 * @author lowe
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanho = 10;
        
        int[] valores = Fibonnaci.interativo(tamanho);
        Fibonnaci.imprimirVetor(valores);
        System.out.println("----------------------------------");
        System.out.println(Fibonnaci.recursivo(tamanho-1));
    }
    
    public static int[] interativo(int tamanho) {
        int[] valores = new int[tamanho];
        valores[0] = 0;
        valores[1] = 1;
        for(int i = 2; i < valores.length; i++){
            valores[i] = valores[i-2] + valores[i-1];
        }
        return valores;
    }
    
    public static int recursivo(int n) {
        if (n <= 1) return n;
        return Fibonnaci.recursivo(n-1) + Fibonnaci.recursivo(n-2);
    }
    
    public static void imprimirVetor(int[] valores){
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
}

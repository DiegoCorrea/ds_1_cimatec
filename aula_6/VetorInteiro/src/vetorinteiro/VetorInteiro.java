package vetorinteiro;

public class VetorInteiro {
    public static void main(String[] args) {
        int[] valores = new int[10];
        
        for(int i = 0; i < valores.length; i++){
            valores[i] = i;
        }
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
        System.out.println("*********************************************");
        for(int i = 0; i < valores.length; i++){
            valores[i] *= 2;
        }
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
}

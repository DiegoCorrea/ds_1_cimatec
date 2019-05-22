package tratamentoerros;

public class TratamentoErros {

    public static void main(String[] args) {
        try{
            int[] numeros_vetor = new int[5];

            for(int i = 0; i <= 10; i++) {
                numeros_vetor[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Um Erro foi encontrado!");            
            System.err.println("Array fora do índice: " + e.getMessage());
        }
    }
    
}

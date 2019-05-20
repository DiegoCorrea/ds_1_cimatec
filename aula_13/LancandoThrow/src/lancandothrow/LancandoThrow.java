package lancandothrow;

public class LancandoThrow {

    public static void main(String[] args) {
        try {
            verificaDigitacao("Texto massa pra imprimir");
            verificaDigitacao("Mais um texto sem erro");
            verificaDigitacao("");
        } catch (ExcecaoTextoInvalido e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void verificaDigitacao(String texto) throws ExcecaoTextoInvalido {
       if (texto.equals("") || texto == null || texto.equals(" ")) {
           throw new ExcecaoTextoInvalido("Texto inválido. Não pode ser vazio!");
       } else {
           System.out.println("O Texto é: " + texto);
       }
    }    
}

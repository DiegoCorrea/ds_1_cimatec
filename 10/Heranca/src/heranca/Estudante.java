package heranca;

/**
 *
 * @author lowe
 */
public class Estudante {
    private final String NOME;
    private final long MATRICULA;

    Estudante(String nome, long matricula){
        this.NOME = nome;
        this.MATRICULA = matricula;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.NOME);
        System.out.println("Matricula: " + this.MATRICULA);
    }
}

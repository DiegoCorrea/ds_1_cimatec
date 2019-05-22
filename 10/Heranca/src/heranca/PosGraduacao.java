package heranca;

/**
 *
 * @author lowe
 */
public class PosGraduacao extends Estudante {
    private String orientador;
    
    PosGraduacao(String orientador, String nome, long matricula){
        super(nome, matricula);
        this.orientador = orientador;
    }
}

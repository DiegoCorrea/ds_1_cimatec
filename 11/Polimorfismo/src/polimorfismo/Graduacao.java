package polimorfismo;

/**
 *
 * @author lowe
 */
public class Graduacao extends Estudante {
    private int semestre;
    
    Graduacao(int semestre, String nome, long matricula){
        super(nome, matricula);
        this.semestre = semestre;
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Semestre: " + this.semestre);
    }
}

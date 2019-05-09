package polimorfismo;

/**
 *
 * @author lowe
 */
public class Doutorado extends PosGraduacao {
    private int numeroArtigos;
    
    Doutorado(int numeroArtigos, String orientador, String nome, long matricula){
        super(orientador, nome, matricula);
        this.numeroArtigos = numeroArtigos;
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Artigos lançados: " + this.numeroArtigos);
    }
}

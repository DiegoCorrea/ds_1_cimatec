package polimorfismo;

/**
 *
 * @author lowe
 */
public class Mestrado extends PosGraduacao {
    private String linhaPesquisa;
    
    Mestrado(String linhaPesquisa, String orientador, String nome, long matricula){
        super(orientador, nome, matricula);
        this.linhaPesquisa = linhaPesquisa;
    }
    
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Linha de Pesquisa: " + this.linhaPesquisa);
    }
}

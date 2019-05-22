package polimorfismo;

/**
 *
 * @author lowe
 */
public class Polimorfismo {

    public static void main(String[] args) {
        imprimirEstudante(estudante());
        imprimirEstudante(tecnico());
        imprimirEstudante(graduacao());
        imprimirEstudante(mestrado());
        imprimirEstudante(doutorado());
    }
    
    public static Estudante estudante() {
        return new Estudante("Estudiodo do Estudo Estudado", 10020172);
    }
    
    public static Estudante tecnico() {
        return new Tecnico("Desenvolvimento de Software", "Tecnaldo Tecnilson", 20020191);
    }
    
    public static Estudante graduacao() {
        return new Graduacao(1, "Estudiodo do Estudo Estudado", 10020172);
    }
    
    public static Estudante mestrado() {
        return new Mestrado("Importante Pesquisa", "Orientinaldo que Orienta", "Mestrando que vai mestrar", 20020191);
    }
    
    public static Estudante doutorado() {
        return new Doutorado(11, "Orientinaldo que Orienta", "Doutorando que vai Doutorar", 20020191);
    }
    
    public static void imprimirEstudante(Estudante estudante) {
        System.out.println("###################################");
        if (estudante instanceof Tecnico) {
            System.out.println("############# Aluno do curso Tecnico #############");
            System.out.println("+ Local: Todos os alunos assistem aula no CIMATEC 4");
            estudante.imprimirDados();
        } else if(estudante instanceof Graduacao) {
            System.out.println("############# Aluno do curso Gradução #############");
            estudante.imprimirDados();
        } else if(estudante instanceof Mestrado) {
            System.out.println("############# Pós Graduação #############");
            System.out.println("############# Aluno do Mestrado #############");
            estudante.imprimirDados();
        } else if(estudante instanceof Doutorado) {
            System.out.println("############# Pós Graduação #############");
            System.out.println("############# Aluno do Doutorado #############");
            estudante.imprimirDados();
        } else {
            System.out.println("############# Um Estudante qualquer #############");
            estudante.imprimirDados();
        }
    }
}

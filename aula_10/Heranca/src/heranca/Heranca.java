package heranca;

public class Heranca {
    public static void main(String[] args) {
        estudante();
        tecnico();
        graduacao();
        mestrado();
        doutorado();
    }
    
    public static void estudante() {
        Estudante estudanteNormal = new Estudante("Estudiodo do Estudo Estudado", 10020172);
        estudanteNormal.imprimirDados();
    }
    
    public static void tecnico() {
        Tecnico alunoTecnico = new Tecnico("Desenvolvimento de Software", "Tecnaldo Tecnilson", 20020191);
        alunoTecnico.imprimirDados();
    }
    
    public static void graduacao() {
        Estudante estudanteGraduacao = new Graduacao(1, "Estudiodo do Estudo Estudado", 10020172);
        estudanteGraduacao.imprimirDados();
    }
    
    public static void mestrado() {
        Mestrado alunoPos = new Mestrado("Importante Pesquisa", "Orientinaldo que Orienta", "Mestrando que vai mestrar", 20020191);
        alunoPos.imprimirDados();
    }
    
    public static void doutorado() {
        Doutorado alunoPos = new Doutorado(11, "Orientinaldo que Orienta", "Doutorando que vai Doutorar", 20020191);
        alunoPos.imprimirDados();
    }
    
}

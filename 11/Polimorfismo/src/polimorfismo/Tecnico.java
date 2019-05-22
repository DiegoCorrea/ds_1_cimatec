/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author lowe
 */
public class Tecnico extends Estudante{
    private String CURSO;

    Tecnico(String curso, String nome, long matricula) {
        super(nome, matricula);
        this.CURSO = curso;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Curso: " + this.CURSO);
    }
}

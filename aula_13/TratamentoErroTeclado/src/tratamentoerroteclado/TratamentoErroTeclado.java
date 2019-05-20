package tratamentoerroteclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoErroTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Digite a idade: ");

            int idade = sc.nextInt();
            System.out.println(idade);
        } catch (InputMismatchException e) {
            System.out.println("Um Erro ocorreu!");
            System.out.println("A seguir encontra-se a arvore de execução.");
            e.printStackTrace();
        }
    }
}

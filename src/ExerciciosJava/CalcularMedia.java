//Calcular a média do aluno e ver se ele foi aprovado ou reprovado
package ExerciciosJava;
import java.util.Scanner;
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Olá aluno " + nome + " ,Seja bem vindo!");

        System.out.println("Aluno "+ nome + " ,digite a sua primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.println("Aluno "+ nome + " ,digite a sua segunda nota: ");
        int nota2 = entrada.nextInt();
        System.out.println("Aluno "+ nome + " ,digite a sua terceira nota: ");
        int nota3= entrada.nextInt();

        int media = (nota1 + nota2 + nota3)/3;

        System.out.println("A media do aluno " + nome + " é: " + media);

        if (media > 70){
            System.out.println("Aluno Aprovado!");
        }
        else {
            System.out.println("Aluno Reprovado!");
        }
    }
}

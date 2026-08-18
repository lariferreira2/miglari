package parte2scanner;
import java.util.Scanner;
public class exe1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Digite o curso: ");
        String curso = entrada.nextLine();

        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite a média final: ");
        double mediaFinal = entrada.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean matriculado = entrada.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média Final: " + mediaFinal);
        System.out.println("Matriculado: " + matriculado);

        entrada.close();
    }
}
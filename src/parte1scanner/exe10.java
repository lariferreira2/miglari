package parte1scanner;
import java.util.Scanner;
public class exe10 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String aluno = entrada.nextLine();

	        System.out.print("Digite o curso: ");
	        String curso = entrada.nextLine();

	        System.out.print("Digite a idade: ");
	        int idade = entrada.nextInt();

	        System.out.println("Aluno: " + aluno);
	        System.out.println("Curso: " + curso);
	        System.out.println("Idade: " + idade + " anos");

	        entrada.close();
	    }
	}
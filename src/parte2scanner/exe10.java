package parte2scanner;
import java.util.Scanner;
public class exe10 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o total de alunos: ");
	        int totalAlunos = entrada.nextInt();

	        System.out.print("Digite a quantidade de grupos: ");
	        int grupos = entrada.nextInt();

	        int resultadoInteiro = totalAlunos / grupos;
	        double resultadoReal = (double) totalAlunos / grupos;

	        System.out.println("Resultado da divisão inteira: " + resultadoInteiro);
	        System.out.println("Resultado da divisão em ponto flutuante: " + resultadoReal);

	        entrada.close();
	    }
	}
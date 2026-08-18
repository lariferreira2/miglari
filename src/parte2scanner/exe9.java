package parte2scanner;
import java.util.Scanner;
public class exe9 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int x = entrada.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int y = entrada.nextInt();

	        int divisaoInteira = x / y;
	        double divisaoReal = (double) x / y;

	        System.out.println("Divisão inteira: " + divisaoInteira);
	        System.out.println("Divisão em ponto flutuante: " + divisaoReal);

	        entrada.close();
	    }
	}
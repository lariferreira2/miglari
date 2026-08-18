package parte1scanner;
import java.util.Scanner;
public class exe3 {

	
	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = entrada.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = entrada.nextInt();

	        int soma = numero1 + numero2;
	        int subtracao = numero1 - numero2;
	        int multiplicacao = numero1 * numero2;
	        int divisao = numero1 / numero2;
	        int resto = numero1 % numero2;

	        System.out.println("Soma: " + soma);
	        System.out.println("Subtração: " + subtracao);
	        System.out.println("Multiplicação: " + multiplicacao);
	        System.out.println("Divisão: " + divisao);
	        System.out.println("Resto da divisão: " + resto);

	        entrada.close();
	    }
	}
package parte2scanner;
import java.util.Scanner;
public class exe12 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o saldo: ");
	        double saldo = entrada.nextDouble();

	        System.out.println(saldo >= 1000);
	        System.out.println(saldo < 500);
	        System.out.println(saldo == 850);
	        System.out.println(saldo != 850);

	        entrada.close();
	    }
	}
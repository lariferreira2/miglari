package parte1scanner;
import java.util.Scanner;
public class exe7 {

	  public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o salário: ");
	        double salario = entrada.nextDouble();

	        int salarioInteiro = (int) salario;
	        double salarioConvertido = (double) salarioInteiro;

	        System.out.println("Salário original: " + salario);
	        System.out.println("Salário em inteiro: " + salarioInteiro);
	        System.out.println("Salário convertido para double: " + salarioConvertido);

	        entrada.close();
	    }
	}
package parte2scanner;
import java.util.Scanner;
public class exe21 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o nome: ");
	        String nome = entrada.nextLine();

	        System.out.print("Digite o salário base: ");
	        double salarioBase = entrada.nextDouble();

	        System.out.print("Digite a quantidade de horas extras: ");
	        int horasExtras = entrada.nextInt();

	        System.out.print("Digite o valor da hora extra: ");
	        double valorHoraExtra = entrada.nextDouble();

	        double valorHorasExtras = horasExtras * valorHoraExtra;
	        double salarioFinal = salarioBase + valorHorasExtras;

	        System.out.println("Nome: " + nome);
	        System.out.println("Salário base: R$ " + salarioBase);
	        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
	        System.out.println("Salário final: R$ " + salarioFinal);

	        entrada.close();
	    }
	}
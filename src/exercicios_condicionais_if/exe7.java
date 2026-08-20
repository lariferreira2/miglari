package exercicios_condicionais_if;
import java.util.Scanner;
public class exe7 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a média final: ");
	        double media = sc.nextDouble();

	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado!");
	        }

	        sc.close();
    }
}
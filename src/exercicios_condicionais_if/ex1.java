package exercicios_condicionais_if;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de idade!");
		}
		else {
			System.out.println("     ");
		}
		sc.close();
	}

}

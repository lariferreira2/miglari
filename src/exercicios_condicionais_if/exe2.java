package exercicios_condicionais_if;
import java.util.Scanner;
public class exe2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("Número positivo!");
		}
		else {
			System.out.println("     ");
		}
        sc.close();
    }
}
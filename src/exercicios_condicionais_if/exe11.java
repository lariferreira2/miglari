package exercicios_condicionais_if;
import java.util.Scanner;
public class exe11 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a média final: ");
	        double media = sc.nextDouble();

	        if (media >= 9.0) {
	            System.out.println("A");
	        } else if (media >= 7.0) {
	            System.out.println("B");
	        } else if (media >= 5.0) {
	            System.out.println("C");
	        } else {
	            System.out.println("D");
	        }

	        sc.close();
    }
}
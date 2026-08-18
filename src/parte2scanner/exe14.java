package parte2scanner;
import java.util.Scanner;
public class exe14 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Está chovendo? (true/false): ");
	        boolean chovendo = entrada.nextBoolean();

	        System.out.print("Tem guarda-chuva? (true/false): ");
	        boolean guardaChuva = entrada.nextBoolean();

	        System.out.print("O carro está disponível? (true/false): ");
	        boolean carroDisponivel = entrada.nextBoolean();

	        System.out.println(chovendo && guardaChuva);

	        System.out.println(guardaChuva || carroDisponivel);

	        System.out.println(!chovendo);

	        System.out.println(chovendo && (guardaChuva || carroDisponivel));

	        System.out.println(!(chovendo && guardaChuva));

	        entrada.close();
	    }
	}
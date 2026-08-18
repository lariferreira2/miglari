package parte1scanner;
import java.util.Scanner;
public class exe9 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Possui ingresso? (true/false): ");
	        boolean possuiIngresso = entrada.nextBoolean();

	        System.out.print("Possui documento? (true/false): ");
	        boolean possuiDocumento = entrada.nextBoolean();

	        System.out.print("Acompanhante é maior de idade? (true/false): ");
	        boolean acompanhanteMaiorIdade = entrada.nextBoolean();

	        // true && false = false
	        System.out.println(possuiIngresso && possuiDocumento);

	        // true || false = true
	        System.out.println(possuiIngresso || possuiDocumento);

	        // !false = true
	        System.out.println(!possuiDocumento);

	        // false || true = true, depois true && true = true
	        System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade));

	        // true && false = false, depois !false = true
	        System.out.println(!(possuiIngresso && possuiDocumento));

	        entrada.close();
	    }
	}
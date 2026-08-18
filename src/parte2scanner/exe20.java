package parte2scanner;
import java.util.Scanner;
public class exe20 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = entrada.nextInt();

	        String atendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

	        System.out.println("Idade: " + idade + " anos");
	        System.out.println("Tipo de atendimento: " + atendimento);

	        entrada.close();
	    }
	}
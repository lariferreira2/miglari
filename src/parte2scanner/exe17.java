package parte2scanner;
import java.util.Scanner;
public class exe17 {
	
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = entrada.nextInt();

        String mensagem = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

        System.out.println("Estoque: " + estoque);
        System.out.println(mensagem);

        entrada.close();
    }
}
package parte2scanner;
import java.util.Scanner;
public class exe15 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = entrada.nextLine();

        System.out.print("Digite o preço: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = entrada.nextInt();

        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");

        entrada.close();
    }
}
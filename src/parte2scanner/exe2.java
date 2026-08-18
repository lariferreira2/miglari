package parte2scanner;
import java.util.Scanner;
public class exe2 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        String marca = entrada.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int ano = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Digite a cor: ");
        String cor = entrada.nextLine();

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();

        System.out.print("É automático? (true/false): ");
        boolean automatico = entrada.nextBoolean();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Automático: " + automatico);

        entrada.close();
    }
}
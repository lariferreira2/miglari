package parte1scanner;
import java.util.Scanner;
public class exe5 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do arroz: ");
        double arroz = entrada.nextDouble();

        System.out.print("Digite o valor do feijão: ");
        double feijao = entrada.nextDouble();

        System.out.print("Digite o valor do óleo: ");
        double oleo = entrada.nextDouble();

        double valorTotal = arroz + feijao + oleo;
        double valorMedio = valorTotal / 3;

        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Valor médio dos produtos: R$ " + valorMedio);

        entrada.close();
    }
}

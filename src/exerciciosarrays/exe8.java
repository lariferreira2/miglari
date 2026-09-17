package parte2scanner;
import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] estoque = new int[3][4];

        int estoqueTotal = 0;

        for (int i = 0; i < estoque.length; i++) {
            System.out.println("\nProduto " + (i + 1));

            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Digite o estoque do período " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }

        int maiorEstoque = -1;
        int produtoMaiorEstoque = 0;

        for (int i = 0; i < estoque.length; i++) {

            int totalProduto = 0;

            for (int j = 0; j < estoque[i].length; j++) {
                totalProduto += estoque[i][j];
            }

            System.out.println(
                "Produto " + (i + 1) + ": " + totalProduto + " unidades"
            );

            estoqueTotal += totalProduto;

            if (totalProduto > maiorEstoque) {
                maiorEstoque = totalProduto;
                produtoMaiorEstoque = i + 1;
            }
        }

        System.out.println("Estoque total: " + estoqueTotal + " unidades");
        System.out.println(
            "Maior estoque acumulado: Produto " + produtoMaiorEstoque
        );

        scanner.close();
    }
}

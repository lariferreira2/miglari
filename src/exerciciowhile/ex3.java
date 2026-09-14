package exerciciowhile;

public class ex3 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            soma = soma + i;
            i++;
        }

        System.out.println("Soma = " + soma);
    }
}


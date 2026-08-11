package parte2;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "João Gomes";
        double salarioBase = 2500.00;
        int horasExtras = 8;
        double valorHoraExtra = 35.00;

        double valorHorasExtras = horasExtras * valorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);
	}

}

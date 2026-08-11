package parte1;

public class exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Carlos";
        double salario = 3000.00;
        int tempoEmpresa = 6;

        double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;
        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);
	}

}

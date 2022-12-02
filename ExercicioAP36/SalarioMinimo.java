import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[]args) {
		double salario;
		final double salarioMinimo = 1212;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual seu salário? ");
		salario = in.nextDouble();
		if (salario<salarioMinimo){
			System.out.println("Você ganha abaixo do salário mínimo atual. :(");	
		} else {
			System.out.println("Você ganha acima do salário mínimo atual. ;) que está em R$"+salarioMinimo);
		}
		in.close();
	}
}

import java.util.Scanner;
public class INSS {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double salarioBruto, salarioLiquido, inss;
		System.out.println("Digite o salário bruto:");
		salarioBruto = in.nextDouble();
		if (salarioBruto <= 2500) {
			inss = salarioBruto*9/100;
			salarioLiquido = salarioBruto-inss;
		} else {
			inss = salarioBruto*11/100;
			salarioLiquido = salarioBruto-inss;
		}
		System.out.println("Seu INSS será: "+inss+". O salário liquido: "+salarioLiquido);
		in.close();
	}
}

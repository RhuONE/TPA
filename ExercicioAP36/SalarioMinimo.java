import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[]args) {
		double salario;
		final double salarioMinimo = 1212;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual seu sal�rio? ");
		salario = in.nextDouble();
		if (salario<salarioMinimo){
			System.out.println("Voc� ganha abaixo do sal�rio m�nimo atual. :(");	
		} else {
			System.out.println("Voc� ganha acima do sal�rio m�nimo atual. ;) que est� em R$"+salarioMinimo);
		}
		in.close();
	}
}

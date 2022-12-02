import java.util.Scanner;
public class IRPF {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double salario, irpf;
		System.out.println("Digite o salário: ");
		salario = in.nextDouble();
		if (salario<=1434.59) {
			irpf = salario*0;
		}else if(salario>=1434.60 && salario<=2150){
			irpf = salario*7.5/100 - 107.59;
		}else if(salario>2150 && salario<=2866.70) {
			irpf = salario*15/100 - 268.84;
		}else if(salario>2866.70 && salario<3582) {
			irpf = salario*22.5/100 - 438.84;
		}else {
			irpf = salario*27.5/100 - 662.94;
		}
		System.out.println("O IRPF será R$"+irpf);
		in.close();
	}
}

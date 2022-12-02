import java.util.Scanner;
public class SalarioVendedor {
	public static void main (String[]args){
		Scanner in = new Scanner (System.in);
		double salarioFixo, salarioFinal, comissao, totalVenda;
		String nomeVendedor = new String();
		System.out.println("Qual nome do vendedor? ");
		nomeVendedor = in.next();
		System.out.println("Qual seu salário fixo? ");
		salarioFixo = in.nextDouble();
		System.out.println("Qual foi o valor do total de vendas? ");
		totalVenda = in.nextDouble();
		comissao = totalVenda*0.15; //não está funcionando com (15/100)
		salarioFinal = salarioFixo+comissao;
		System.out.println("o vendedor "+nomeVendedor+ " tem seu salário fixo em "+salarioFixo+
				" e seu salário final será "+salarioFinal);
		in.close();
	}
}

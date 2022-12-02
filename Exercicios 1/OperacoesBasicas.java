import java.util.Scanner;
public class OperacoesBasicas {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double n1, n2, soma, diferenca, produto, quociente;
		System.out.println("Digite o primeiro número: ");
		n1 = in.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = in.nextDouble();
		soma = n1+n2;
		diferenca = n1-n2;
		produto = n1*n2;
		quociente = n1/n2;
		System.out.println(n1+" e "+n2+" têm se a soma = "+soma+", a diferença = "+diferenca+
				", o produto = "+produto+", e o quociente = "+quociente);
		in.close();
	}
}

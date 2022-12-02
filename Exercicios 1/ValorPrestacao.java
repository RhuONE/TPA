import java.util.Scanner;
public class ValorPrestacao {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double valorCompra, qtdPrestacao, valorPrestacao;
		System.out.println("Digite o valor da compra: ");
		valorCompra= in.nextDouble();
		System.out.println("Digite a quantidade de prestações desejada: ");
		qtdPrestacao = in.nextDouble();
		valorPrestacao = valorCompra-(10/100*valorCompra)/qtdPrestacao;
		System.out.println("Cada prestação com 10% de desconto fica em R$"+valorPrestacao);
		in.close();
	}
}
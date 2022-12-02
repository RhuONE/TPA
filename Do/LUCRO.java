import java.util.*;
public class LUCRO {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double precoProduto, margemLucro, precoVenda;
		String r;
		do {
			System.out.println("Digite o preço de custo do produto: ");
			precoProduto = in.nextDouble();
			System.out.println("Digite em porcentagem a margem de lucro: ");
			margemLucro = in.nextDouble();
			precoVenda = precoProduto+(precoProduto*margemLucro/100);
			System.out.println("Para lucrar "+margemLucro+"% sobre R$"
					+precoProduto+" você deve vender por R$"+precoVenda);
			System.out.println("Deseja continuar a execução? (S/N)");
			r = in.next();
		} while (r.equals("S")|| r.equals("s"));
		System.out.println("Encerrando a execução...");
		in.close();
	}
}

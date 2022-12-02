import java.util.Scanner;
public class Ipva {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double pVeiculo, ipva;
		System.out.println("Digite o preço do veiculo: ");
		pVeiculo = in.nextDouble();
		ipva = 4/100*pVeiculo;
		System.out.println("o ipva do carro é "+ipva);
		in.close();
	}
}

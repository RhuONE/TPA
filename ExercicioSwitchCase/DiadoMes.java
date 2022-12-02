import java.util.*;
public class DiadoMes {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int numMes;
		System.out.println("Digite um número correspondente ao um mês (1 a 12)");
		numMes = in.nextInt();
		switch (numMes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("O mês tem 31 dias.");
				break;
			case 2:
				System.out.println("O mês tem 28 dias.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("O mês tem 30 dias.");
				break;
			default:
				System.out.println("Valor inválido");
		}
		in.close();
	}
	
}

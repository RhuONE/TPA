import java.util.*;
public class Cantina {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int cod;
		System.out.println("Informe o código do produto:");
		cod = in.nextInt();
		switch (cod) {
			case 1:
				System.out.println("Cachorro quente R$8,00");
				break;
			case 2:
				System.out.println("Chesseburguer R$12,00");
				break;
			case 3:
				System.out.println("X-salada R$15,00");
				break;
			case 4:
				System.out.println("Misto quente R$11,00");
				break;
			case 5:
				System.out.println("Pão na chaoa R$6,00");
				break;
			default:
				System.out.println("Código inválido!");
		}
		in.close();
	}
}

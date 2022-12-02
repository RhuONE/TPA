import java.util.*;
public class PositivoOuNegativo {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double n;
		System.out.print("Digite o número:");
		n = in.nextDouble();
		if (n>=0) {
			if (n==0) {
				System.out.print(n+" é um número neutro.");
			}else {
				System.out.print(n+" é um número positivo.");
			}
		}else {
			System.out.print(n+" é um número negativo.");
		}in.close();
	}
}

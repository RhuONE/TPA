import java.util.*;
public class PositivoOuNegativo {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double n;
		System.out.print("Digite o n�mero:");
		n = in.nextDouble();
		if (n>=0) {
			if (n==0) {
				System.out.print(n+" � um n�mero neutro.");
			}else {
				System.out.print(n+" � um n�mero positivo.");
			}
		}else {
			System.out.print(n+" � um n�mero negativo.");
		}in.close();
	}
}

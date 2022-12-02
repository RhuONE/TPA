import java.util.Scanner;
public class OrdemABC {
	public static void main(String[]Args) {
		Scanner in = new Scanner (System.in);
		int a, b, c, menor, medio, maior;
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		menor = a;
		medio = a;
		maior = a;
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		if (b<menor) {
			menor=b;
		} else if (b>maior) {
			maior=b;
		} else {
			medio=b;
		}
		System.out.println("Digite o valor de C: ");
		c = in.nextInt();
		if (c<menor ) {
			medio = menor;
			menor = c;
		} else if (c>maior) {
			medio = maior;
			maior = c;
		} else {
			medio = c;
		}
		System.out.println(menor+" "+medio+" "+maior);
		in.close();
	}
}

import java.util.Scanner;
public class ValoresTrocados {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite o valor de A: ");
		a = in.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = in.nextDouble();
		c=a;
		a=b;
		b=c;
		System.out.println("Em A est� "+a+" e em B est� "+b);
		in.close();
	}
}

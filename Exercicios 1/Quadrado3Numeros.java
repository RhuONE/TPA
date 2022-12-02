import java.util.Scanner;
public class Quadrado3Numeros {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double soma, a, b, c;
		System.out.println("Digite o primeiro valor: ");
		a = in.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = in.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		c = in.nextDouble();
		soma = a*a+b*b+c*c;
		System.out.println("A soma dos quadrados de "+a+" "+b+" "+c+" é "+soma);
		in.close();
	}
}
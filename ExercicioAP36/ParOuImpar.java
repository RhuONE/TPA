import java.util.Scanner;
public class ParOuImpar {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double  n;
		System.out.println("Digite o número:");
		n = in.nextDouble();
		if (n%2 == 0){
			System.out.println("Seu número é par.");
		} else {
			System.out.println("Seu número é impar.");
		}
		in.close();
	}	
	
}

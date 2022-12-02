import java.util.Scanner;
public class gastoMedio {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double kmL, km, litro;
		System.out.println("distância percorrida (em quilômtros): ");
		km = in.nextDouble();
		System.out.println("litros de gasolina gastos: ");
		litro = in.nextDouble();
		kmL = km/litro;
		System.out.println("Ele faz "+kmL+"Km/L");
		if (kmL<10) {
			System.out.println("Esse carro não é econômico.");
		} else {
			System.out.println("Esse carro é econômico. ");
		}
		in.close();
	}
}

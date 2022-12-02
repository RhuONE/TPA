import java.util.Scanner;
public class MetrosParaKm {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double m, km;
		System.out.println("Digite o valor em metros: ");
		m = in.nextDouble();
		km = m/1000;
		System.out.println(m+ " metros convertidos são "+km+" quilometros.");
		in.close();
	}
}

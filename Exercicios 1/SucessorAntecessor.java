import java.util.Scanner;
public class SucessorAntecessor {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int x, ant, suc;
		System.out.println("Digite um valor: ");
		x = in.nextInt();
		ant = x-1;
		suc = x+1;
		System.out.println("O antecessor de "+x+" é "+ant+", e o seu sucessor é "+suc);
		in.close();
	}
}

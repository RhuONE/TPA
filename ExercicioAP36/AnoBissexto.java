import java.util.Scanner;
public class AnoBissexto {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int anoNasc;
		System.out.println("Em qual ano você nasceu?");
		anoNasc = in.nextInt();
		if (anoNasc % 4 == 0) {
			System.out.println("Você nasceu em um ano bissexto.");
		} else {
			System.out.println("Você não nasceu em um ano bissexto.");
		}
		in.close();
	}
}

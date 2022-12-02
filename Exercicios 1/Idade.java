import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int anoSelec, anoNasc, idade;
		System.out.println("Digite o ano de nascimento: ");
		anoNasc = in.nextInt();
		System.out.println("Digite o ano que você deseja conferir a idade: ");
		anoSelec = in.nextInt();
		idade = anoSelec-anoNasc;
		System.out.println("Nascido em "+anoNasc+", terá em "+anoSelec+" "+idade+" anos.");
		in.close();
	}
}

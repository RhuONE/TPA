import java.util.*;
public class TituloEleitor {
	public static void main (String []args) {
		int idade, anoNasc, anoAtual;
		Scanner in = new Scanner (System.in);
		System.out.println("Em que ano você nasceu? ");
		anoNasc = in.nextInt();
		System.out.println("Em que ano estamos?");
		anoAtual = in.nextInt();
		idade = anoAtual-anoNasc;
		if (idade>=16) {
			System.out.print("Você pode tirar seu título de eleitor.");
		}else {
			System.out.print("Você ainda não pode tirar seu título de eleitor.");
		}in.close();
	}
}

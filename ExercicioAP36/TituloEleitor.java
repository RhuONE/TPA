import java.util.*;
public class TituloEleitor {
	public static void main (String []args) {
		int idade, anoNasc, anoAtual;
		Scanner in = new Scanner (System.in);
		System.out.println("Em que ano voc� nasceu? ");
		anoNasc = in.nextInt();
		System.out.println("Em que ano estamos?");
		anoAtual = in.nextInt();
		idade = anoAtual-anoNasc;
		if (idade>=16) {
			System.out.print("Voc� pode tirar seu t�tulo de eleitor.");
		}else {
			System.out.print("Voc� ainda n�o pode tirar seu t�tulo de eleitor.");
		}in.close();
	}
}

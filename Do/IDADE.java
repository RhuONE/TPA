import java.util.*;
public class IDADE {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int anoAtual, anoNasc, idade, r;
		System.out.println("Digite o ano atual:");
		anoAtual= in.nextInt();
		do {
			System.out.println("Digite o ano de nascimento:");
			anoNasc=in.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println(idade+", ");
			if (idade>=18) {
				System.out.println("Maior de idade.");
			}else {
				System.out.println("Menor de idade.");
			}
			System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
			r=in.nextInt();
		}while(r==1);
		in.close();
	}
}

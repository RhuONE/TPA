import java.util.*;
public class FaixaEtaria {
	public static void main (String[]args) {
		int idade, anoNasc, anoAtual;
		Scanner in = new Scanner (System.in);
		System.out.println("Em qual ano você nasceu?");
		anoNasc = in.nextInt();
		System.out.println("Em qual ano estamo?");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		if (idade < 10) {
			System.out.println(idade+", você é criança.");
		}else {
			if (idade >=10 && idade <18) {
				System.out.println(idade+", você é um adolescente.");
			}else {
				if (idade >=18 && idade<60) {
					System.out.println(idade+", você é um adulto.");
				}else {
					System.out.println(idade+", olá vovozinho!");
				}
			}
		}in.close();
	}
}

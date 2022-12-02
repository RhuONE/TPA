import java.util.*;
public class MAISNOVOEVELHOFOR {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int anoAtual, anoNasc, idade, maiorIdade, menorIdade, i;
		System.out.print("Digite o ano atual:");
		anoAtual = in.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = in.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println(idade+" ");
		maiorIdade = idade;
		menorIdade = idade;
		for(i=1;i<10;i++) {
			System.out.print("Digite o ano de nascimento: ");
			anoNasc = in.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println(idade+" ");
			if(idade >= maiorIdade) {
				maiorIdade=idade;
			} else if (idade<=menorIdade) {
				menorIdade=idade;
			}
		}
		System.out.println("O mais velho tinha "+maiorIdade+" anos;");
		System.out.println("O mais novo tinha"+menorIdade+" anos.");
		in.close();
	}
}

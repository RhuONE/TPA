import java.util.Scanner;
public class MaisVelho {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int idade1, idade2, idade3, idade4, idade5, maiorIdade, menorIdade;
		String nome1, nome2, nome3, nome4, nome5, nomeVelho, nomeNovo;
		System.out.println("Digite o 1º nome: ");
		nome1=in.next();
		System.out.println("Digite a idade: ");
		idade1=in.nextInt();
		maiorIdade=idade1;
		menorIdade=idade1;
		nomeVelho=nome1;
		nomeNovo=nome1;
		System.out.println("Digite o 2º nome: ");
		nome2=in.next();
		System.out.println("Digite a idade: ");
		idade2=in.nextInt();
		if (idade2>maiorIdade) {
			nomeVelho=nome2;
			maiorIdade=idade2;
		} else if (idade2<menorIdade) {
			nomeNovo=nome2;
			menorIdade=idade2;
		}
		System.out.println("Digite o 3º nome: ");
		nome3=in.next();
		System.out.println("Digite a idade: ");
		idade3=in.nextInt();
		if (idade3>maiorIdade) {
			nomeVelho=nome3;
			maiorIdade=idade3;
		} else if (idade3<menorIdade) {
			nomeNovo=nome3;
			menorIdade=idade3;
		}
		System.out.println("Digite o 4º nome: ");
		nome4=in.next();
		System.out.println("Digite a idade: ");
		idade4=in.nextInt();
		if (idade4>maiorIdade) {
			nomeVelho=nome4;
			maiorIdade=idade4;
		} else if (idade4<menorIdade) {
			nomeNovo=nome4;
			menorIdade=idade4;
		}
		System.out.println("Digite o 5º nome: ");
		nome5=in.next();
		System.out.println("Digite a idade: ");
		idade5=in.nextInt();
		if (idade5>maiorIdade) {
			nomeVelho=nome5;
			maiorIdade=idade5;
		} else if (idade5<menorIdade) {
			nomeNovo=nome5;
			menorIdade=idade5;
		}
		in.close();
		System.out.println("A pessoa mais velha é "+nomeVelho+", com "+maiorIdade+" anos. ");
		System.out.println("Já a pesso mais nova é "+nomeNovo+", com "+menorIdade+" anos. ");
	}
}

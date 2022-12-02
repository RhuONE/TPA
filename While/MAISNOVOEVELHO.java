import java.util.*;
public class MAISNOVOEVELHO {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int idade, maiorIdade, menorIdade, i=1;
		String nome, maiorNome, menorNome;
		System.out.println("Digite um nome: ");
		nome=in.next();
		System.out.println("Digite uma idade: ");
		idade=in.nextInt();
		maiorIdade=idade;
		maiorNome=nome;
		menorIdade=idade;
		menorNome=nome;
		while (i<10) {
			i++;
			System.out.println("Digite um nome: ");
			nome=in.next();
			System.out.println("Digite uma idade: ");
			idade=in.nextInt();
			if(idade>=maiorIdade) {
				maiorIdade=idade;
				maiorNome=nome;
			}else if (idade<=menorIdade) {
				menorIdade=idade;
				menorNome=nome;
			}
		}
		System.out.println(menorNome+" é o mais novo com "+menorIdade+" anos");
		System.out.println(maiorNome+" é o mais velho com"+maiorIdade+" anos.");
		in.close();
	}
}

import java.util.*;
public class CategoriaAlunoFutebol {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int idadeAluno;
		System.out.println("Qual a idade do aluno? (6 a 10 anos)");
		idadeAluno = in.nextInt();
		System.out.println("Categoria:");
		switch(idadeAluno) {
			case 6:
				System.out.println("Dente de leite");
				break;
			case 7:
				System.out.println("Júnior");
				break;
			case 8:
				System.out.println("Júnior max");
				break;
			case 9:
				System.out.println("Júnior master");
				break;
			case 10:
				System.out.println("Master");
				break;
			default:
				System.out.println("Idade inválida! só aceitamos de 6 a 10 anos.");
		}
	}
}

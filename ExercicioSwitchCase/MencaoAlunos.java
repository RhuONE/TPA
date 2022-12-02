import java.util.*;
public class MencaoAlunos {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int qtdAlunos, qtdMB, qtdB, qtdR, qtdI;
		double porcemMB, porcemB, porcemR, porcemI;
		System.out.println("Digite o total de alunos da sala:");
		qtdAlunos = in.nextInt();
		System.out.println("Digite o total de alunos que tiraram MB:");
		qtdMB = in.nextInt();
		System.out.println("Digite o total de alunos que tiraram B:");
		qtdB = in.nextInt();
		System.out.println("Digite o total de alunos que tiraram R:");
		qtdR = in.nextInt();
		System.out.println("Digite o total de alunos que tiraram I:");
		qtdI = in.nextInt();
		porcemMB = (100*qtdMB)/qtdAlunos;
		porcemB = 100*qtdB/qtdAlunos;
		porcemR = 100*qtdR/qtdAlunos;
		porcemI = 100*qtdI/qtdAlunos;
		System.out.println("ESTATISTICAS:");
		System.out.println("Para "+qtdAlunos+" alunos, são:");
		System.out.println(porcemMB+"% de alunos com MB;");
		System.out.println(porcemB+"% de alunos com B;");
		System.out.println(porcemR+"% de alunos com R;");
		System.out.println(porcemI+"% de alunos com I.");
		in.close();
	}
}

import java.util.Scanner;
public class DiasParaMesesAnos {
	public static void main(String[]args) {
	Scanner in= new Scanner (System.in);
	double dia, mes, ano;
	System.out.println("Digite o valor de dias a ser convertidos: ");
	dia = in.nextDouble();
	mes = dia/30;
	ano = dia/365;
	System.out.println(dia+" dias é "+mes+" meses ou "+ano+" em anos.");
	in.close();
	}
}

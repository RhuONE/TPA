import java.util.*;
public class INSS {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double sal, inss, i=1;
		do {
			System.out.println("Digite o salário:");
			sal=in.nextDouble();
			if(sal<2000) {
				inss=sal*0.085;
				}
			else{
				inss=sal*0.11;
			}
			System.out.println("O Desconto do INSS é: "+inss);
			i++;
		} while(i<=4);
		in.close();
	}
}

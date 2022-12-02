import java.util.*;
public class NUMERO {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double n;
		String r;
		for(r="S";r.equals("S") || r.equals("s") ;) {
			System.out.println("Digite um número: ");
			n = in.nextDouble();
			if(n>0) {
				System.out.println(n+" é positivo.");
			}else if(n==0) {
				System.out.println(n+" é neutro.");
			}else {
				System.out.println(n+" é negativo.");
			}
			System.out.println("Deseja continuar a execução? (S/N)");
			r = in.next();
		}
		in.close();
	}
}

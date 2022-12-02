import java.util.*;
public class FAHRENHEIT {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double f, c;
		String r;
		do {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			f = in.nextDouble();
			c = (f-32)/1.8;
			if(c<15) {
				System.out.println(c+" Frio.");
			}else if (c>=22) {
				System.out.println(c+" Calor.");
			}else {
				System.out.println(c+" Ameno.");
			}
			System.out.println("Deseja continuar a execução? (S/N)");
			r=in.next();
		}while(r.equals("S") || r.equals("s"));
		in.close();
	}
}

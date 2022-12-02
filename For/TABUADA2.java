import java.util.*;
public class TABUADA {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i, n, p;
		System.out.println("Digite um número: ");
		n = in.nextInt();
		for(i=1; i<=10; i++) {
			p = n*i;
			System.out.println(n+" x "+i+" = "+p);
		}
		in.close();
	}
}

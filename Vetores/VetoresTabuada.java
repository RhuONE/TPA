import java.util.Scanner;
public class VetoresTabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a[] = new int[6], i, j;
		for(i=1;i<=5;i++) {
			System.out.println("Digite o "+i+"º número");
			a[i]=in.nextInt();
		}
		for(i=1;i<=5;i++) {
			System.out.println("Tabuada de "+a[i]+":");
			for(j=1;j<=10;j++) {
				System.out.println(j+" x "+a[i]+" = "+(j*a[i]));
			}
			System.out.println();
		}
		in.close();
	}
}

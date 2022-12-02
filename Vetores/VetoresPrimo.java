import java.util.Scanner;
public class VetoresPrimo {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a[]=new int[11], i, j, p=0;
		for(i=1;i<=10;i++) {
			System.out.println("Digite o valor do "+i+"º elemento: ");
			a[i]=in.nextInt();
		}
		for(i=1;i<=10;i++) {
			for(j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					p++;
				}
			}
				if(p>=3) {
					System.out.println(a[i]+" Não é PRIMO.");
				} else {
					System.out.println(a[i]+" É Primo. UAU");
				}
			p=0;
		}
	}
}

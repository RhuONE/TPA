import java.util.Scanner;
public class VetorParEImpar {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, j=0, l=19;
		a = new int [20];
		b = new int [20];
		for(i=0;i<=19;i++) {
			System.out.print("Digite o "+(i+1)+"º valor:");
			a[i]=in.nextInt();
			if(a[i]%2==0) {
				b[j]=a[i];
				j++;
			} else {
				b[l]=a[i];
				l--;
			}
		}
		System.out.println();
		for(i=0;i<=19;i++) {
			if(i==0) {
				System.out.print("["+a[i]+" ");
			} else if(i==19) {
				System.out.print(a[i]+"]");
			} else {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		for(i=0;i<=19;i++) {
			if(i==0) {
				System.out.print("["+b[i]+" ");
			} else if(i==19) {
				System.out.print(b[i]+"]");
			} else {
				System.out.print(b[i]+" ");
			}
		}
		in.close();
	}
}

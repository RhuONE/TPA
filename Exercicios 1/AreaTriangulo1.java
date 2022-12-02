import java.util.Scanner;
public class AreaTriangulo1 {
	public static void main(String[]args) {
	Scanner in= new Scanner (System.in);
	double base, altura, area;
	System.out.println("Digite a medida da base: ");
	base = in.nextDouble();
	System.out.println("Digite a medida da altura: ");
	altura = in.nextDouble();
	area = base*altura/2;
	System.out.println("A area do triangulo é = "+area);
	in.close();
	}
}

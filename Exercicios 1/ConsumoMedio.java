import java.util.Scanner;
public class ConsumoMedio {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double deltaSEmKm, combustivelGasto, consumoMedio;
		System.out.println("Qual foi a dist�ncia percorrida? ");
		deltaSEmKm = in.nextDouble();
		System.out.println("Quanto de combust�vel gasto? ");
		combustivelGasto = in.nextDouble();
		consumoMedio = deltaSEmKm/combustivelGasto;
		System.out.println("O autom�vel tem o consumo m�dio de "+consumoMedio+" km/l");
		in.close();
	}
}

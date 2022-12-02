import java.util.Scanner;
public class ConsumoMedio {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double deltaSEmKm, combustivelGasto, consumoMedio;
		System.out.println("Qual foi a distância percorrida? ");
		deltaSEmKm = in.nextDouble();
		System.out.println("Quanto de combustível gasto? ");
		combustivelGasto = in.nextDouble();
		consumoMedio = deltaSEmKm/combustivelGasto;
		System.out.println("O automóvel tem o consumo médio de "+consumoMedio+" km/l");
		in.close();
	}
}

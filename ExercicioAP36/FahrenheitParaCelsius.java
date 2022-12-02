import java.util.*;
public class FahrenheitParaCelsius {
	public static void main (String args []) {
		double f, c;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual a temperatura em Fahrenheit? ");
		f=in.nextDouble();
		c=(f-32)/1.8;
		if (c<15) {
			System.out.print("°"+f+" Fahrenheit é "+c+"º em Celsius. Frio");
		}else {
			if (c<22) {
				System.out.print("°"+f+" Fahrenheit é "+c+"º em Celsius. Ameno");
			}else {
				System.out.print("°"+f+" Fahrenheit é "+c+"º em Celsius. Calor");
			}
			
		}in.close();
	}
}

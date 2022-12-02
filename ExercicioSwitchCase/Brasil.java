
public class Brasil {
	public static void main(String[]args) {
		double hab=220, h, f, bh=0.88, bf=0.82, ano=0;
		h = hab*47/100;
		f = hab*53/100;
		while (h<=f) {
			h=h+bh;
			f=f+bf;
			ano++;
		}	
		System.out.println(ano);
	}
}

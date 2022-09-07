package d2022_05_09;

import java.util.ArrayList;

public class RadnikMain {

	public static void main(String[] args) {
		
		Sektor s = new Sektor("Sektor1", 50000);
		Menadzer a = new Menadzer("Marko Markovic");
		Magacioner b = new Magacioner("Nikola Nikolic");
		a.zaposliUSektor(s);
		b.zaposliUSektor(s);
		System.out.println(a.plataRadnika());
		System.out.println();
		
	}

}

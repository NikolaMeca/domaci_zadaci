package d2022_05_09;

import java.util.ArrayList;

public class Magacioner extends Radnik {

/*Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
 suma plata svih sektor / broj sektora * 0.5
 override uje metodu za platu, tako da se plata racuna po formuli:
(prosecna plata za sve sektore u kojima radi) * (broj sektora).
*/

	public Magacioner(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}
	private double prosecnaPlata() {
		int brojac = 0;
		for(int i = 0; i < sektori.size(); i++) {
			sektori.get(i);
			brojac++;
		}
		
		return this.plataRadnika() / brojac * 0.5;
	}
	@Override
	public double plataRadnika() {
		int brojac = 0;
		for (int i = 0; i < sektori.size(); i++) {
			sektori.get(i);
			brojac++;
		}
		return this.prosecnaPlata() * brojac;
		
	}
}

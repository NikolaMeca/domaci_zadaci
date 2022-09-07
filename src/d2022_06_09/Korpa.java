package d2022_06_09;

import java.util.ArrayList;

public class Korpa {
/*Kreirati klasu Korpa koja ima:
niz ambalaza
metodu dodaj ambalazu
metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
kao parametar funkcije se prima Super karticu iz koje se cita popust.

U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
 i istestirati sve metode i ispisati ukupnu cenu sa popustom.
*/
	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}
	public void izbaciAmbalazu(String barCode) {
		for (int i = ambalaze.size(); i > 0; i--) {
			if(ambalaze.get(i).getBarCode().equals(barCode)) {
				ambalaze.remove(i);
			}
			
		}
	}
	private int cenaSvihAmbalazaSaPopustom(SuperKartica popust) {
		int brojac = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			if(ambalaze.contains(popust)) {
				brojac++;
			}
		}return brojac;
	}
	public double ukupnaCenaKorpe(SuperKartica popust) {
		double suma = 0;
		for(int i = 0; i < ambalaze.size(); i++) {
			suma = 1.0 * suma + ambalaze.get(i).cenaArtikla();
		}
		return suma;
	}
}

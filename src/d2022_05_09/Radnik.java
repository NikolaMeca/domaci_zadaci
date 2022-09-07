package d2022_05_09;

import java.util.ArrayList;

public abstract class Radnik {
/*Kreirati abstraktnu klasu Radnik koja ima:
 ime i prezime
 niz sektora u kojima radi
 abstraktnu metodu koja vraca platu radnika
 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
*/
	private String punoIme;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	public Radnik(String punoIme) {
		super();
		this.punoIme = punoIme;
		
	}
	
	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public abstract double plataRadnika();
	public void zaposliUSektor (Sektor sektor) {
		sektori.add(sektor);
	}
}

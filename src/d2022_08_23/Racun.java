package d2022_08_23;

public class Racun {
/*Zadatak
Kreirati klasu Racun koja ima:
broj racuna (npr: 170-289328923-23)
ime i prezime osobe
trenutno stanje na racunu (npr: 100, 1220)
gettere i setter za sve atribute, sem settera za stanje na racunu
metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
metodu koja stampa podatke o racunu u formatu:
Ime i prezime  -  broj racuna
stanje na racunu je (trenutno stanje) rsd.
	*/
	private String brojRacuna;
	private String punoIme;
	private double trenutnoStanje;
	
//	public Racun(String brojRacuna, String punoIme, int trenutnoStanje) {
//		super();
//		this.brojRacuna = brojRacuna;
//		this.punoIme = punoIme;
//		this.trenutnoStanje = trenutnoStanje;
//	}
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public void promenaStanja(double transakcija) {
		if (this.trenutnoStanje + transakcija < 0) {
			System.out.println("nemate dovoljno sredstava");
		} else {
			this.trenutnoStanje += transakcija;
		}
	}
	public void print () {
		System.out.println("Ime: " + this.punoIme + " - broj racuna: " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd");
	}
}

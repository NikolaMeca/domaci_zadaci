package d2022_08_25;

public class Ispit {
/*
Napisati klasu Ispit koja ima
naziv predmeta
ocenu (u rasponu od 5 do 10)
Ime i prezime profesora koji predaje predmet
konstuktore koje mislite da ce vam trebati
gettere i settere za sve atribute
metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
metodu koja stampa ispit u formatu:
(naziv predmeta) - (profesor) - (ocena)*/
	private String nazivPredmeta;
	private int ocena;
	private String punoImeProf;
	
	public Ispit(String nazivPredmeta, int ocena, String punoImeProf) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.punoImeProf = punoImeProf;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getPunoImeProf() {
		return punoImeProf;
	}
	public void setPunoImeProf(String punoImeProf) {
		this.punoImeProf = punoImeProf;
	}
	public boolean jePolozen() {
		if(this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	public void print () {
		System.out.println("Naziv predmeta: " + this.nazivPredmeta + 
				" Profesor: " + punoImeProf + " Ocena: " + this.ocena );
	}
	
}

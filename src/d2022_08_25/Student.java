package d2022_08_25;

import java.util.ArrayList;

public class Student {
	/*
	 * Napisati klasu Student koja ima broj indeksa ime i prezime tip studija
	 * (osnovne, master, doktorske) niz ispita konstuktore koje mislite da ce vam
	 * trebati gettere i settere za indeks, ime i prezime, tip studija getter za niz
	 * predmeta metodu dodaj ispit u niz ispita metodu koja racuna prosek na
	 * studijama (u prosek se ubrajaju samo polozeni ispiti) metodu stampaj koja
	 * stampa u formatu: (broj indeksa) - (ime i prezime) - (tip studija) Predmeti:
	 * (naziv predmeta) - (profesor) - (ocena) (naziv predmeta) - (profesor) -
	 * (ocena) (naziv predmeta) - (profesor) - (ocena) Prosecna ocena: (prosecna
	 * ocena)
	 * 
	 * 
	 * 
	 */
	private int brojIndeksa;
	private String punoIme;
	private String tipStudija;
	private ArrayList<Ispit> ispiti;
	
	private Student() {
		this.ispiti = new ArrayList<Ispit>();
	}

	public Student(int brojIndeksa, String punoIme, String tipStudija) {
		this();
		this.brojIndeksa = brojIndeksa;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;		
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosecnaOcena() {
		int brojac = 0;
		int suma = 0;
		for (int i = 0; i < ispiti.size(); i++) 
		{			
			if (ispiti.get(i).jePolozen() == true) 
			{
				suma = suma + ispiti.get(i).getOcena();
				brojac++;
			}
		} 
		
		return  (suma  * 1.0) / brojac;
	}

	public void print() {
		System.out.println(
				"Broj indexa: " + this.brojIndeksa + " puno ime: " + this.punoIme + " tip studija: " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			/*
			String predmet = ispiti.get(i).getNazivPredmeta();
			String prof = ispiti.get(i).getPunoImeProf();
			String ocena = String.valueOf(ispiti.get(i).getOcena());
			
			System.out.println(predmet + " - " + prof + " - " + ocena);
			*/
			
			System.out.println(
				ispiti.get(i).getNazivPredmeta()
				+ " - "
				+ ispiti.get(i).getPunoImeProf()
				+ " - "
				+ ispiti.get(i).getOcena()
			);
		}
		System.out.println("Prosecna ocena: " + prosecnaOcena());
	}

}

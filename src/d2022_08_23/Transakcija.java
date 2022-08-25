package d2022_08_23;

public class Transakcija {
/*	Kreirati klasu Transakcija koja ima:
id transakcije
racun sa kog se prenose sredstva
racun na koji se prenose sredstva
gettere i settere
konstruktore
privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
ako je prenos sredstava manji od 4500, provizija je fiksna 45
ako je prenos sredstava veci od 4500, provizija je 1% 
S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar
 koji predstavlja visinu transakcije
Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
Kao parametar funkcije se unosi vrednost koja se prebacuje. 
Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
 a na drugi racun dodaje samo (trazena suma).
*/
	private String id;
	private Racun racunPosiljaoca;
	private Racun racunPrimalaca;
	public Transakcija () {
		
	}
	public Transakcija(String id, Racun racunPosiljaoca, Racun racunPrimalaca) {
		this.id = id;
		this.racunPosiljaoca = racunPosiljaoca;
		this.racunPrimalaca = racunPrimalaca;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Racun getRacunPosiljaoca() {
		return racunPosiljaoca;
	}
	public void setRacunPosiljaoca(Racun racunPosiljaoca) {
		this.racunPosiljaoca = racunPosiljaoca;
	}
	public Racun getRacunPrimalaca() {
		return racunPrimalaca;
	}
	public void setRacunPrimalaca(Racun racunPrimalaca) {
		this.racunPrimalaca = racunPrimalaca;
	}
	private double provizija(int visinaUplate) {
		if (visinaUplate < 4500) {
			return 45;
		} else {
			return  visinaUplate * 0.01;
		}
	}
	public void izvrsiTransakciju (int visinaTransakcije) {
		double zaPlacanje = visinaTransakcije + provizija(visinaTransakcije);
		
		this.racunPosiljaoca.promenaStanja(-1 * zaPlacanje);
		this.racunPrimalaca.promenaStanja(visinaTransakcije);

	}
	public void print() {
		System.out.println("ID transakcije: "+ this.id);
		System.out.println("Racun sa: " + this.racunPosiljaoca.getBrojRacuna() + " ime i Prezime: " + this.racunPosiljaoca.getPunoIme());
		System.out.println("Racun na: " + this.racunPrimalaca.getBrojRacuna() + " ime i prezime: " + this.racunPrimalaca.getPunoIme() );
	}
	
	
	
	
}

package d2022_06_09;

public class SuperKartica {
/*Kreirati klasu SuperKartica koja ima:
broj kartice
ime i prezime vlasnika
popust (200, 500, … )
konstuktore (default-ni i sa parametrima)
gettere i settere 
metodu stampaj koja stampa karticu u formatu:
(broj kartice), (ime i prezime)
*/
	private String brojKartice;
	private String punoImeVlasnika;
	private int popust;
	public SuperKartica(String brojKartice, String punoImeVlasnika, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.punoImeVlasnika = punoImeVlasnika;
		this.popust = popust;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}
	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public void print() {
		System.out.println("Broj kartice: " + this.brojKartice + " ime vlasnika " + this.punoImeVlasnika);
	}
}

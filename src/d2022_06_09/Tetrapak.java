package d2022_06_09;

public class Tetrapak extends Ambalaza {
/*Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
atribut koji kaze da li se moze reciklirati
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu tako da ispunjava uslova:
ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
ako nije u cenu ulazi samo osnovna cena
metoda stampaj stampa sve podatke iz klase tetrapak.

*/
	private boolean mozeReciklirati;
	private int osnovnaCena;
	public Tetrapak(String barCode, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeReciklirati,
			int osnovnaCena) {
		super(barCode, nazivArtikla, netoTezina, brutoTezina);
		this.mozeReciklirati = mozeReciklirati;
		this.osnovnaCena = osnovnaCena;
	}
	public boolean isMozeReciklirati() {
		return mozeReciklirati;
	}
	public int getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setMozeReciklirati(boolean mozeReciklirati) {
		this.mozeReciklirati = mozeReciklirati;
	}
	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if(this.mozeReciklirati) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		}
		else return this.osnovnaCena;
	}
	@Override
	public void print() {
		System.out.println("Recikliranje: " +this.mozeReciklirati + " Osnovna cena: " + this.cenaArtikla());
	}
}

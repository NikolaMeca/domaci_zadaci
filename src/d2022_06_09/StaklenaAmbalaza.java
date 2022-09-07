package d2022_06_09;

public class StaklenaAmbalaza extends Ambalaza {
/*Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
kaucija za flasu
atribut koji kaze da li se za flasu placa kaucija
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu
ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
ako se ne placa, (osnovna cena) * 1.2
metoda stampaj stampa sve podatke iz klase staklena flasa
*/
	private int kaucija;
	private boolean placaKaucija;
	private int osnovnaCena;
	public StaklenaAmbalaza(String barCode, String nazivArtikla, double netoTezina, double brutoTezina,
			boolean placaKaucija, int osnovnaCena) {
		super(barCode, nazivArtikla, netoTezina, brutoTezina);
		
		this.placaKaucija = placaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	public int getKaucija() {
		return kaucija;
	}
	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacaKaucija() {
		return placaKaucija;
	}
	public void setPlacaKaucija(boolean placaKaucija) {
		this.placaKaucija = placaKaucija;
	}
	public int getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if(this.placaKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}
		else return this.osnovnaCena * 1.2;
	}
	@Override
	public void print() {
		System.out.println("Kaucija: " +this.kaucija + " Placa kaucija: " + this.placaKaucija 
				+ " Osnovna cena " + this.cenaArtikla());
	}
}

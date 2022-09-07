package d2022_06_09;

public abstract class Ambalaza {
/*1.Zadatak
Kreirati abstraktnu klasu Ambalaza koja ima:
barkod (primer: 328232-2823)
naziv artikla
neto tezinu
bruto tezinu
konstuktore (default-ni i sa parametrima)
gettere i settere
metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
abstraktnu metodu koja vraca cenu artikla
abstraktnu metodu stampaj
*/
	private String barCode;
	private String nazivArtikla;
	private double netoTezina;
	private double brutoTezina;
	public Ambalaza(String barCode, String nazivArtikla, double netoTezina, double brutoTezina) {
		super();
		this.barCode = barCode;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getNazivArtikla() {
		return nazivArtikla;
	}
	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}
	public double getNetoTezina() {
		return netoTezina;
	}
	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}
	public double getBrutoTezina() {
		return brutoTezina;
	}
	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	public double tezinaPakovanja() {
		 double tezinaPakovanja = this.brutoTezina - this.netoTezina;
		return tezinaPakovanja;
	}
	public abstract double cenaArtikla();
	public abstract void print();
}

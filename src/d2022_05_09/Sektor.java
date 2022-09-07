package d2022_05_09;

public class Sektor {
/*Zadatak  
Kreirati klasu Sektor koja ima:
 naziv sektora
 platu koja je za taj sektor
*/
	private String nazivSektora;
	private int plata;
	public Sektor(String nazivSektora, int plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}
	public String getNazivSektora() {
		return nazivSektora;
	}
	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	
}

package d2022_08_26;

public class Trener extends Osoba {
/*Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
godine iskustva
tip trenera (kondicioni, za igru, pomocni, personalni)
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
*/
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener(int godineIskustva, String tipTrenera) {
		super();
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Iskustvo: " + this.godineIskustva + " tip trenera: " + this.tipTrenera);
	}
}

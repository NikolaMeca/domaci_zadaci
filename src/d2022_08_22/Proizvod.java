package d2022_08_22;

public class Proizvod {
/*(Za vezbanje) Kreirati klasu Proizvod koja ima:
sifru proizvoda
naziv proizvoda
cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
gettere i settere za sifru i naziv
setter za cenu po kilogramu
metodu getCenaKg koja vraca cenu za 1 kg proizvoda
metodu getCenaLb koja vraca cenu za 1lb prozvoda
 		konverzija: 1 kg = 2.2046 lb
metodu koja stampa proizvod u formatu:
(sifra) - (naziv)

	Kreirati klasu Vaga koja ima:
merna jedinica (kg ili lb)
proizvod (proizvod koji se meri)
TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
default-ni konstuktor
getteri i setteri za sve atribute
metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
               (sifra) - (naziv)
   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
   Ukupno: (ukupna cena) 	      
*/
	
	private int sifra;
	private String naziv;
	private double cenapoKg;
	public Proizvod(int sifra, String naziv, double cenapoKg) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenapoKg = cenapoKg;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setCenapoKg(double cenapoKg) {
		this.cenapoKg = cenapoKg;
	}
	public double getCenaKG(){
		
			return this.cenapoKg * 2.2046;
		
	}
	public double getCenaLB() {
		return this.cenapoKg / 2.2046;
	}
	public void print() {
		System.out.println("sifra: "+ this.sifra + " - naziv: "+ this.naziv);
		
	}
	
}

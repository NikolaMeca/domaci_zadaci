package d2022_08_18;

public class SmartAirConditioning {
/*3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
atribut za izabranu temperaturu (minimum je 16, maksimum 35)
atribut za mod (hladi/greje)
metodu za stampu - stampa u formatu 
marka - mod - termperatura
metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
metodu koja racuna koliko klima novca potrosi za mesec dana
Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
Metoda vraca ukupnu cenu za taj mesec

U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
*/
	public String markaKlime;
	public double potrosnjaHladiUKW ;
	public double potrosnjaGrejeUKW;
	public double izabranaTemp;
	public boolean mod;
	
	public void stampa() {
		System.out.println("Marka: " + markaKlime + " - mod: " + mod + " - temperatura: "+ izabranaTemp);
	}
	public double mesecnaPotrosnja() {
		if(this.mod == true) {
			return  30 * 15 * 1.0 ;
		}
		if(this.mod == false) {
			return 30 * 15 * 2.0 ;
		}
		return 0;
	}
	public double novacPotrosnja() {
		int i = 0;
		int suma1 = 0;
		int suma2 = 0;
		for (i = 0; i < 450; i++){
			if(i < 350) {
			suma1 = suma1 + 6;
			}
			else {
				suma2 = suma2 + 9;
			}
		}
		return suma1 + suma2;
	}
	
}

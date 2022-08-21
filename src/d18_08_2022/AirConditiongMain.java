package d2022_08_18;

public class AirConditiongMain {

	public static void main(String[] args) {
		
		
		SmartAirConditioning klima = new SmartAirConditioning();
		
		klima.markaKlime = "Samsung";
		klima.potrosnjaHladiUKW = 1;
		klima.potrosnjaGrejeUKW = 2;
		klima.izabranaTemp = 22.0;
		klima.mod = true;
		klima.stampa();
		klima.mesecnaPotrosnja();
		System.out.println("U modu dok hladi potrosi: " + klima.mesecnaPotrosnja() + " KW na mesecnom novu");
		klima.novacPotrosnja();
		System.out.println("Potrosnja u dinarima: " + klima.novacPotrosnja() + " RSD");
	

	}

}

package d2022_06_09;

public class AmbalazaMain {

	public static void main(String[] args) {
		Tetrapak jogurt = new Tetrapak("415187584", "Jogurt", 250.0, 270.0, true, 100);
		jogurt.tezinaPakovanja();
		jogurt.cenaArtikla();
		jogurt.print();
		
		
		StaklenaAmbalaza sok = new StaklenaAmbalaza("54485154", "sok", 175.0, 200.0, false, 150);
		sok.cenaArtikla();
		sok.print();
		
	}

}

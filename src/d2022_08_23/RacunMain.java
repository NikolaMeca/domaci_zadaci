package d2022_08_23;

public class RacunMain {

	public static void main(String[] args) {
		
		Racun posiljaoc = new Racun();
		posiljaoc.setBrojRacuna("10-123456789-10");
		posiljaoc.setPunoIme("Petrovic Petar");
		posiljaoc.promenaStanja(10000);
		
		Racun primalac = new Racun();
		primalac.setBrojRacuna("10-987654321-10");
		primalac.setPunoIme("Markovic Marko");
		primalac.promenaStanja(4600);

		posiljaoc.print();
		primalac.print();
		
		Transakcija a = new Transakcija("asdasd66",posiljaoc ,primalac );
		a.izvrsiTransakciju(5300);
		a.print();
		
		posiljaoc.print();
		primalac.print();
	}

}

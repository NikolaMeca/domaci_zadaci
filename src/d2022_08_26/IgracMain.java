package d2022_08_26;

public class IgracMain {

	public static void main(String[] args) {
		Igrac marko = new Igrac();
		marko.setBrojDresa(54);
		marko.setPozicija("odbrana");
		marko.setKapiten(false);
		marko.setPunoIme(" Marko Maric");
		marko.setJmbg("12456789");
		marko.setGodinaRodjenja(1992);
		marko.print();
		System.out.println();
		Igrac nikola = new Igrac(14, "napadac", true);
		nikola.setPunoIme("Nikola Nikolic");
		nikola.setJmbg("1425145245");
		nikola.setGodinaRodjenja(1991);
		nikola.print();
		System.out.println();
		Trener vlada = new Trener(5, "Kondicioni");
		vlada.setGodinaRodjenja(1980);
		vlada.setJmbg("45485565");
		vlada.setPunoIme("Vlada Vladic");
		vlada.print();
		

	}

}

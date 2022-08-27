package d2022_08_25;

import java.util.ArrayList;

public class IspitMain {

	public static void main(String[] args) {

		Student Nikola = new Student(1006, "Nikola Meca", "master");
		
		Ispit a = new Ispit("Anatomija", 9, "Pera Peric");
		Ispit b = new Ispit("Engleski", 9, "Marko Maric");
		Ispit c = new Ispit("Fudbal", 10, "Nikola Nikolic");
		
		Nikola.dodajIspit(a);
		Nikola.dodajIspit(b);
		Nikola.dodajIspit(c);
		
		Nikola.print();
		
		System.out.println();
		
		Student Kojic = new Student(666, "Kojic Koja", "osnovne");
		
		Ispit ka = new Ispit("Java", 7, "Pera Sokolovic");
		Ispit kb = new Ispit("HTML", 9, "Mirko Maric");
		Ispit kc = new Ispit("Menadzment", 10, "Nikola Djokic");
		
		Kojic.dodajIspit(ka);
		Kojic.dodajIspit(kb);
		Kojic.dodajIspit(kc);
		
		Kojic.print();

		System.out.println();
		
		Student Arsenije = new Student(1644, "Arsenije Arsa", "doktorske");

		Arsenije.dodajIspit(a);
		Arsenije.dodajIspit(b);
		Arsenije.dodajIspit(c);
		
		Arsenije.print();
		System.out.println();
		Nikola.print();
		System.out.println();
		
		a.setOcena(6);

		Arsenije.print();
		System.out.println();
		Nikola.print();
		System.out.println();
		
		
	}

}

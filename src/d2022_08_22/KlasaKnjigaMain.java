package d2022_08_22;

public class KlasaKnjigaMain {

	public static void main(String[] args) {
		
		Autor Selimovic = new Autor("Mesa", "Selimovic");
		Knjiga Tvrdjava = new Knjiga("ne znam sta je", "Tvrdjava", 1951, Selimovic);
		
		
		Autor Dostojevski = new Autor();
		Dostojevski.setIme("Fjodor");
		Dostojevski.setPrezime("Dostojevski");
		Dostojevski.print();
		
		Knjiga Kockar = new Knjiga();
		Kockar.setIsbn("CAO");
		Kockar.setNaziv("Kockar");
		Kockar.setGodinaIzdanja(1888);
		Kockar.setAutor(Dostojevski);
		Kockar.print();
		
	}

}

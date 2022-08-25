package d2022_08_23;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {

	public static void main(String[] args) {
	//	ZeleniKarton ispit1 = new ZeleniKarton("Momcilo Bajaga", 442, "Anatomija", "Zmaj od nocaja", 10);
		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> ispiti = new ArrayList<> (); 
		System.out.println("Unesite n");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Student");
			String student = s.next();
			System.out.println("br indeksa");
			int brIndexa = s.nextInt();
			System.out.println("Predmet");
			String nazivPredmeta = s.next();
			System.out.println("profesor");
			String profesor = s.next();
			System.out.println("ocena");
			int ocena = s.nextInt();
			ispiti.add(new ZeleniKarton(student, brIndexa, nazivPredmeta, profesor, ocena));
		}
		
		for(int i = 0; i < ispiti.size(); i++) {
			System.out.print(ispiti.get(i).getImeStudenta() + " ");
			System.out.print(ispiti.get(i).getBorjIndexa()+ " ");
			System.out.print(ispiti.get(i).getNazivPredmeta() + " ");
			System.out.print(ispiti.get(i).getImeProfesora() + " ");
			System.out.print(ispiti.get(i).getOcena() + " ");
			System.out.println();
		}
	}

}

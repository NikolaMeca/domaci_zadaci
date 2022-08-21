package d2022_08_18;

public class FacebookMain {

	public static void main(String[] args) {
		
		
		Facebook milan = new Facebook();
		
		milan.imeKoPostavlja = "Milan Jovanovic";
		milan.imeNaCijemJePotsavljeno = "Vlada Minic";
		milan.tekstObjave = "Cao Vlado, sta ima?";
		milan.brojLajkova = 10;
		milan.brojDeljenja = 2;
		milan.like();
		milan.dislike();
		milan.share();
		milan.print();
		
		
		System.out.println();
		Facebook vlada = new Facebook();
		vlada.imeKoPostavlja = "Vlada Minic";
		vlada.imeNaCijemJePotsavljeno = "Milan Jovanovic";
		vlada.tekstObjave = "Evo nista, 'ranim kuce!";
		vlada.brojLajkova = 99;
		vlada.brojDeljenja = 10;
		vlada.like();
		vlada.dislike();
		vlada.share();
		vlada.print();

	}

}

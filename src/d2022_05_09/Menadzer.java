package d2022_05_09;

import java.util.ArrayList;

public class Menadzer extends Radnik {



/*Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

*/
	public Menadzer(String punoIme) {
		super(punoIme);
		
	}

	@Override
	public double plataRadnika() {
		int suma = 0;
		for(int i = 0; i < sektori.size(); i++) {
			suma = suma + sektori.get(i).getPlata();
		}
		return suma;
	}
}

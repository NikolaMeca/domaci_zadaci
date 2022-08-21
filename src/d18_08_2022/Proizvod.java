package d2022_08_18;

import java.util.Scanner;

public class Proizvod {
/*Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
 Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, 
a povratnu vrednost je cena proizvoda kada se uračuna popust.
Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
 Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
za tezinu do 100g, postarina iznosi 200din
za tezinu od 101g do 500g, postarina iznosi 400din
za tezinu preko 500g, postarina iznosi 1000din

U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od
 definisanih funkcija.
*/
	Scanner s = new Scanner(System.in);
		public String nazivProizvoda;
		public double cenaProizvoda;
		public double tezinaProizvoda;
		
		public void stampaj() {
		System.out.println(nazivProizvoda);
		System.out.println(cenaProizvoda);
		System.out.println(tezinaProizvoda);
	}
		public void povecajCenu(double povecanje) {
			this.cenaProizvoda = this.cenaProizvoda + povecanje;
		}
		public double vratiCenuSaPopustom(double popust) {
			return this.cenaProizvoda - popust;
		}
		public double racunajPostarinu() {
			
			if (this.tezinaProizvoda < 100) {
				return this.cenaProizvoda - 200;
			}
			if (this.tezinaProizvoda >= 101 && this.tezinaProizvoda < 500) {
				return this.cenaProizvoda - 400;
			}
			if (this.tezinaProizvoda >= 500) {
				return this.cenaProizvoda - 1000;
			}
			return 0;
		}
}
	

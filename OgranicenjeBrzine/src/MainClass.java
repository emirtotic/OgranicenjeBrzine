/*Ideja zadatka je da kreiramo automobile
 * da izbacujemo random brzinu kretanja
 * da napravimo metodu radar i eventualne kazne
 * 
 * Potrebno je napraviti motor sa istim metodama
 * i dodati metodu kaciga koja nije vidljiva u superklasi automobil.
 */

public class MainClass {

	public static void main(String[] args) {
		
		Automobil a1 = new Automobil("Audi", "A4", "Crna", "BG 1049 SH");
		Automobil a2 = new Automobil("Peugeot", "508", "Siva", "NS 276 OR");
		Motor m1 = new Motor("Yamaha", "R1", "SO 963", "Crvena");
		
		m1.radar();
		m1.kaciga();
		m1.prekrsaj();
		m1.kazna();
		
		a1.radar();
		a1.prekrsaj();
		a1.kazna();
		
		a2.radar();
		a2.prekrsaj();
		a2.kazna();
	}

}

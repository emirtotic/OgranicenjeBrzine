import java.util.Random;

public class Automobil {

	private String marka;
	private String model;
	private String boja;
	private String regOznaka;
	private int brzinaKretanja;
	private int ogranicenjeBrzine;
	
	Random randomBroj = new Random();
	
	public Automobil() {
		
	}

	public Automobil(String marka, String model, String boja, String regOznaka) {

		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.regOznaka = regOznaka;
	}
	
	public void radar() {
		System.out.println(" ");
		System.out.println("Ogranicenje brzine na ovoj deonici puta je 50km/h.");
		brzinaKretanja = randomBroj.nextInt(150);
		System.out.println(" ");
		System.out.println("Vozilo: " + marka);
		System.out.println("Model: " + model);
		System.out.println("Boja: " + boja);
		System.out.println("Brzina kretanja: " + brzinaKretanja + " km/h.");
		System.out.println(" ");
	}
	
	public void prekrsaj() {
		ogranicenjeBrzine = 50;
		
		if (brzinaKretanja > ogranicenjeBrzine) {
			System.out.println("Vozilo " + marka + " " + model + " sa registarskom oznakom: " + regOznaka + ", je u prekrsaju. Zaustavite vozaca.");
		}
		else if (brzinaKretanja > 0 && brzinaKretanja <= 20) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Ajde brze some!");
		}
		else if (brzinaKretanja > 20 && brzinaKretanja <= 30) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Blic'o mu neko. Usrala se cavulja.");
		}
		else if(brzinaKretanja > 30 && brzinaKretanja <= 50) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Sve po propisu!");
		}
	}
	
	public void kazna() {
		if (brzinaKretanja > 50 && brzinaKretanja <= 70) {
			System.out.println("Novcana kazna predvidjena za ovaj prekrsaj iznosi: 8000 dinara.");
		}
		else if (brzinaKretanja > 70 && brzinaKretanja <= 85) {
			System.out.println("Novcana kazna predvidjena za ovaj prekrsaj iznosi: 15000 dinara i 6 kaznenih poena.");
		}
		else if (brzinaKretanja > 85 && brzinaKretanja <= 120) {
			System.out.println("Novcana kazna predvidjena za ovaj prekrsaj iznosi: 50000 dinara, 12 kaznenih poena i iskljucivanje iz saobracaja.");
		}
		else if (brzinaKretanja > 120) {
			System.out.println("Tvorza matoriiiii, tvorza...");
		}
		else if(brzinaKretanja == 0) {
			System.out.println("Zabranjeno je zaustavljanje. Nastavite voznju ili se pomerite sa strane!");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}

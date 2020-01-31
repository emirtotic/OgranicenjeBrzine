
public class Motor extends Automobil {
	
	private String marka;
	private String model;
	private String regOznaka;
	private String boja;
	private int brzinaKretanja;
	
	public Motor() {
		
	}

	public Motor(String marka, String model, String regOznaka, String boja) {
		super();
		this.marka = marka;
		this.model = model;
		this.regOznaka = regOznaka;
		this.boja = boja;
	}
	
	public void kaciga() {
		boolean kaciga;
		kaciga = randomBroj.nextBoolean();
		System.out.println("Da li motorista nosi kacigu? - " + kaciga);
		
		if (kaciga == true ) {
			System.out.println("Motorista nosi kacigu.");
		}
		else {
			System.out.println("Motorista nema kacigu. Sledi predvidjena kazna.");
		}
		
		System.out.println(" ");
		
	}
	
	@Override
	public void radar() {
		System.out.println(" ");
		System.out.println("Ogranicenje brzine na ovoj deonici puta je 50km/h.");
		brzinaKretanja = randomBroj.nextInt(180);
		System.out.println(" ");
		System.out.println("Vozilo: " + this.marka);
		System.out.println("Model: " + model);
		System.out.println("Boja: " + boja);
		System.out.println("Brzina kretanja: " + brzinaKretanja + " km/h.");
		System.out.println(" ");
		
	}
	
	@Override
	public void prekrsaj() {
		int ogranicenjeBrzine = 50;
		
		if (brzinaKretanja > ogranicenjeBrzine) {
			System.out.println("Vozilo " + marka + " " + model + " sa registarskom oznakom: " + regOznaka + ", je u prekrsaju. Zaustavite vozaca.");
		}
		else if (brzinaKretanja > 0 && brzinaKretanja <= 20) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Ne gnjavi, brze malo!");
		}
		else if (brzinaKretanja > 20 && brzinaKretanja <= 30) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Gnjaviiiissss...");
		}
		else if(brzinaKretanja > 30 && brzinaKretanja <= 50) {
			System.out.println("Vozilo nije u prekrsaju.");
			System.out.println("Sve po propisu!");
		}
	}
	
	@Override
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
			System.out.println("Kolega, jesi li ga video? :D ");
		}
		else if(brzinaKretanja == 0) {
			System.out.println("Zabranjeno je zaustavljanje. Nastavite voznju ili se pomerite sa strane!");
		}
	}
	
	
}

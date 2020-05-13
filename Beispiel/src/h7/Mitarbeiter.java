package h7;

public abstract class Mitarbeiter {
	int persnr;
	String name;
	String address;
	int startYear;
	int salaryHour;

	public Mitarbeiter(String n, int p, String a, int y, int sh) {
		name = n;
		persnr = p;
		address = a;
		startYear = y;
		salaryHour = sh;
	}

	public double monatsBrutto() {
		return salaryHour * 154;
	}
	
	public void print() { print(0); }

	public void print(int i) {
		System.out.println("Name: " + name);
		System.out.println("Personalnummer: " + persnr);
		System.out.println("Adresse: " + address);
		System.out.println("Eintrittsjahr: " + startYear);
		System.out.println("Stundenlohn: " + salaryHour);
	}

}

package h7;

public class Angestellter extends Mitarbeiter {

	public Angestellter(String n, int p, String a, int y, int sh) {
		super(n, p, a, y, sh);
	}
	
	public void print() { print(0); }
	
	public void print(int i) {
		if (i == 0)
			System.out.println("\nAngestellter");
		super.print(i);
		if (i == 0)
			System.out.println("Monatliches Gehalt: " + monatsBrutto());
	}


}

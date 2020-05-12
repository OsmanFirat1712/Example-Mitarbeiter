package h7;

public class Manager extends Angestellter {

	double bonus;

	public Manager(String n, int p, String a, int y, int sh, double b) {
		super(n, p, a, y, sh);
		bonus = b;
	}
	
	public double monatsBrutto() { return super.monatsBrutto() + bonus; }
	
	public void print() { print(0); }

	public void print(int i) {
		if (i == 0)
			System.out.println("\nManager");
		super.print(1);
		System.out.println("Bonus: " + bonus);
		if (i == 0)
			System.out.println("Monatliches Gehalt: " + monatsBrutto());
	}


}

package h7;

public class CEO extends Manager {

	double options;

	public CEO(String n, int p, String a, int y, int sh, double b, double o) {
		super(n, p, a, y, sh, b);
		options = o;
	}
	public double monatsBrutto() { return super.monatsBrutto() + options; }

	public void print() {
		System.out.println("\nCEO");
		super.print(1);
		System.out.println("Optionen: " + options);
		System.out.println("Monatliches Gehalt: " + monatsBrutto());
	}

}

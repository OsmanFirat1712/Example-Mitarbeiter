package h7;

public class H7 {

	public static void main(String[] args)
	{
		Mitarbeiter[] ma = new Mitarbeiter[4];
		ma[0] = new CEO("Lou", 1, "Armonk", 1993, 3500, 20000, 30000);
		ma[1] = new Manager("Sam", 2, "Armonk", 1983, 1500, 10000);
	//	ma[2] = new Arbeiter("Joe", 3, "Armonk", 1973, 50, 100);
		ma[3] = new Angestellter("Fred", 4, "Armonk", 1989, 100);
		double ts = 0;
		for(Mitarbeiter m: ma) {
			m.print();
			ts += m.monatsBrutto();
		}
		System.out.println("Die monatlichen Lohnkosten für alle Mitarbeiter betragen " + ts);
	}

}

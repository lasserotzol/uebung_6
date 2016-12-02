

public class Autotester {

	public static void main(String[] args) {
		Auto testwagen1 = new Auto(0.1,300);
		Auto testwagen2 = new Auto(0.07,50);


		for (int a = 1; a < 4; a++) {
			int kilometerstand1 = Zufall.getZufallInt(0, 1000);
			int kilometerstand2 = Zufall.getZufallInt(0, 1000);

			testwagen1.fahre(kilometerstand1);
			testwagen2.fahre(kilometerstand2);
			
			System.out.println("Auto A ist bereits gefahren " + testwagen1.kilometerstand);
			System.out.println("Tankstand Auto A " + testwagen1.tankinhalt);
			System.out.println("Auto B ist bereits gefahren " + testwagen2.kilometerstand);
			System.out.println("Tankstand Auto B " + testwagen2.tankinhalt);

		}
	}

}

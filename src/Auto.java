public class Auto {
	public double benzinverbrauchProKilometer;
	public double kilometerstand;
	public double tankinhalt = 40;
	public double maximalerTankinhalt;

	public void tanken(int liter) {
		tankinhalt = liter + tankinhalt;
		if (maximalerTankinhalt < tankinhalt) {
			tankinhalt = maximalerTankinhalt;
		}
	}

	public void fahre(double kilometer) {
		kilometerstand = kilometerstand + kilometer;
		tankinhalt = tankinhalt - (kilometer * benzinverbrauchProKilometer);

		if (tankinhalt <= 0) {
			kilometerstand = kilometerstand
					+ (tankinhalt / benzinverbrauchProKilometer);
			tankinhalt = 0;

		}

	}
	public Auto (double verbrauch,double tankgroesse) {
		benzinverbrauchProKilometer = verbrauch;
		maximalerTankinhalt = tankgroesse;
		
	}

}

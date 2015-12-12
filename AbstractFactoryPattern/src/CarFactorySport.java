
public class CarFactorySport implements CarFactory {

	@Override
	public CarEngine addCarEngine() {
        return new CarEngineSport();
	}

	@Override
	public CarColor addCarColor() {
		return new CarColorRed();
	}

	
	
}

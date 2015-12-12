
public class CarFactoryFamily implements CarFactory {

	@Override
	public CarEngine addCarEngine() {
        return new CarEngineFamily();
	}

	@Override
	public CarColor addCarColor() {
		return new CarColorBlack();
	}

	
	
}

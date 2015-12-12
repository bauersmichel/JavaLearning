
public class CarSport extends Car {

	private CarFactory carFactory;
	
	public CarSport(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	void makeCar() {
	   this.carEngine = carFactory.addCarEngine();
       this.carColor = carFactory.addCarColor();
	}

}

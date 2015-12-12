
public class CarFamily extends Car {

	private CarFactory carFactory;
	
	public CarFamily(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	void makeCar() {
	   this.carEngine = carFactory.addCarEngine();
       this.carColor = carFactory.addCarColor();
	}

}

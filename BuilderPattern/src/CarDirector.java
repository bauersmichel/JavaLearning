
public class CarDirector {

	private CarBuilder carbuilder;

	public CarDirector(CarBuilder carbuilder) {
		this.carbuilder = carbuilder;
		
	}
	
	public void buildCar() {
		this.carbuilder.buildFrame();
		this.carbuilder.buildEngine();
		this.carbuilder.buildColor();
	}
	
	public Car getCar() {
		return this.carbuilder.getCar();
	}
	
}

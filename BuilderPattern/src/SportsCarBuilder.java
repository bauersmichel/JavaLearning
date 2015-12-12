
public class SportsCarBuilder implements CarBuilder {

	private Car car;
	
	public SportsCarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildFrame() {
		this.car.setFrame("Sportwagen");
	}

	@Override
	public void buildEngine() {
		this.car.setEngine(250);

	}

	@Override
	public void buildColor() {
		this.car.setColor("rot");
	}

	@Override
	public Car getCar() {
		return this.car;
	}

}

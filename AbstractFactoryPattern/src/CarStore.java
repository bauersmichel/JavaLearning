
public class CarStore extends Store{

	@Override
	protected Car makeCar(String typeOfCar) {
		Car car = null;
		
		if (typeOfCar.equals("SPORT")) {
		   CarFactory carFactory = new CarFactorySport();
		   car = new CarSport(carFactory);
		   car.setName("Sportwagen");
		   car.makeCar();
        }
	
		if (typeOfCar.equals("FAMILY")) {
			 CarFactory carFactory = new CarFactoryFamily();
			 car = new CarFamily(carFactory);
			 car.setName("Familienwagen");
			 car.makeCar();
		}

		return car;
	}

}

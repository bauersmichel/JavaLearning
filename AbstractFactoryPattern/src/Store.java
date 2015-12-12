
public abstract class Store {
	
	protected abstract Car makeCar(String typeOfCar);
	public Car orderCar(String typeOfCar) {
		 Car car = makeCar(typeOfCar);
		 
		 return car;
		
	}
	

}

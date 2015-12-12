
public class AbstractCarFactoryTest {

	public static void main(String[] args) {
		Store store = new CarStore();
		
		Car sportsCar =  store.makeCar("SPORT");
		System.out.println(sportsCar);

		Car familyCar =  store.makeCar("FAMILY");
		System.out.println(familyCar);

		
	}

}

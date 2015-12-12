
public class BuilderPatternTest {

	public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        
        CarDirector director = new CarDirector(sportsCarBuilder);
        
        director.buildCar();
        Car car = director.getCar();
        
        System.out.println(car.getFrame());
        System.out.println(car.getEngine());
        System.out.println(car.getColor());
	}

}

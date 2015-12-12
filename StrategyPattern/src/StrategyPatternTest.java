
public class StrategyPatternTest {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println(dog.flys());
		System.out.println(bird.flys());

	}

}

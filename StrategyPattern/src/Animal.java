
public class Animal {
	
	private String name;
	private double weight;
	private int age;
	private Flys flyClass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Flys getFlyClass() {
		return flyClass;
	}
	public void setFlyClass(Flys flyClass) {
		this.flyClass = flyClass;
	}
	public String flys() {
		return flyClass.flys();
	}

}

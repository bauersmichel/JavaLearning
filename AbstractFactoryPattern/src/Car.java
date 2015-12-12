
public abstract class Car {
	
	private String name;
	CarEngine carEngine;
	CarColor carColor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void makeCar();
	
	public String toString() {
		return "Ein " + this.name + " mit " + carEngine + " in " + carColor;
 	}
	

}

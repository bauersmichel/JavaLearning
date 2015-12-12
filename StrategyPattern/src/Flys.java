
public interface Flys {
	
	String flys();

}


class IamFlying implements Flys{

	@Override
	public String flys() {
		return "Ich kann fliegen!";
	}
}

class CantFly implements Flys{

	@Override
	public String flys() {
		return "Ich kann nicht Fliegen!";
	}
	
}
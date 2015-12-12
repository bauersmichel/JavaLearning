
public class Car implements CarPlan {
    
	private String frameType;
	private int engineHp;
	private String carColor;
	
	@Override
	public void setFrame(String frame) {
        frameType = frame;
	}

	@Override
	public void setEngine(int hp) {
        engineHp = hp;
	}

	@Override
	public void setColor(String color) {
		carColor = color;
	}
	
	public String getFrame() {
		return frameType;
	}
	
	public int getEngine() {
		return engineHp;
	}

	public String getColor() { 
		return carColor;
	}
}

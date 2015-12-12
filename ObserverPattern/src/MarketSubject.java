import java.util.ArrayList;

public class MarketSubject implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int apfel;
	private int birne;
	
	public MarketSubject(int apfel, int birne, int orange) {
		this.apfel = apfel;
		this.birne = birne;
		this.orange = orange;
	}
	
    public MarketSubject() {
	    this(1,2,3);	
	}

	private int orange; 
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detatch(Observer o) {
		//int deleteIndex = observers.indexOf(o);
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(apfel, birne, orange);
		}
	}

    public void setPriceApfel(int newPrice) {
    	this.apfel = newPrice;
    	notifyObservers();
    }
    
    public void setPriceBirne(int newPrice) {
    	this.birne = newPrice;
    	notifyObservers();
    }
    
    public void setPriceOrange(int newPrice) {
    	this.orange = newPrice;
    	notifyObservers();
    }
	
	
}

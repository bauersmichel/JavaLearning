
public class MarketObserver implements Observer {

	private static int observerIdIdx = 0;
	private int observerID;
	private Subject marketSubject;
	
	public MarketObserver(Subject marketSubject) {
		this.observerID = ++observerIdIdx;
		this.marketSubject = marketSubject;
		this.marketSubject.attach(this);
		System.out.println("New Observer create (ID =" + this.observerID + ")" );
	}
	
	@Override
	public void update(int apfel, int birne, int orange) {
		System.out.println("MarketObserver" + this.observerID + ": Prices changed:");
		System.out.println("Apfel: " + apfel );
		System.out.println("Birne: " + birne );
		System.out.println("Orange: " + orange );
	}

}

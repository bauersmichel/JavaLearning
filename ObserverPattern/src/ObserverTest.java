
public class ObserverTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MarketSubject marketSubject = new MarketSubject();
		
		MarketObserver marketObserver1 = new MarketObserver(marketSubject);
		MarketObserver marketObserver2 = new MarketObserver(marketSubject);
		
		marketSubject.setPriceApfel(5);
        
		marketSubject.detatch(marketObserver2);
		
		marketSubject.setPriceBirne(7);

	}

}

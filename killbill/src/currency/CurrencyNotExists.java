package currency;

public class CurrencyNotExists extends RuntimeException{
	
	private StringBuilder msg_;
	
	public CurrencyNotExists(final String currency) {	
		msg_.append(currency + "does not exist");
	}
	
	public void what(){
		System.out.println(msg_);
	}
	
}
package currency;

public enum Currency {
	USD("USD"),
	EUR("EUR"),
	RUB("RUB"),
	GBR("GBR");
	
	final String currencyName_;
	
	private Currency(final String currencyName){
		currencyName_ = currencyName;
	}

	public String getCurrencyName() {
		return currencyName_;
	}
	
	public static Currency getCurrencyByName(final String currencyName){
		
		for(Currency curr : Currency.values()){
			
			if(currencyName.compareTo(curr.getCurrencyName()) == 0){
				return curr;
			}
		}
		
		return null;
	}
	
}

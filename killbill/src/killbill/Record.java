package killbill;

import currency.Currency;

public class Record {
	
	final double    priceForUnit_;
	final double	quantity_;
	final String  	description_;
	final Currency	currency_;
	double          totalPrice_;
	
	public double getTotalPrice() {
		return totalPrice_;
	}


	void setTotalPrice(double totalPrice) {
		this.totalPrice_ = totalPrice;
	}

	public Record(final String desc, final Currency currency, double quantity, double unitPrice){
		
		description_  = desc;
		currency_     = currency;
		quantity_ 	  = quantity;
		priceForUnit_ = unitPrice;
	}


	public double getPriceForUnit() {
		return priceForUnit_;
	}


	public double getQuantity() {
		return quantity_;
	}


	public String getDescription() {
		return description_;
	}


	public Currency getCurrency() {
		return currency_;
	}


	@Override
	public String toString() {
		return "Record [description_=" + description_ + ", currency_=" + currency_ + ", totalPrice_=" + totalPrice_
				+ "]";
	}
	
	
}

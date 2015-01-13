package killbill;

import java.io.FileReader;
import java.util.HashMap;

public class CurrencyConverter {
	
	private HashMap<Currency, Double> rates_;
	private static String ratesPath_ = null;
	
	private CurrencyConverter(){
		createRateMap();
		
	}
	
	private void createRateMap(){
		rates_ = new HashMap<>();
		FileReader fd = readFile(ratesPath_);
		//TODO:fill rates_;
	}
	
	private FileReader readFile(String ratesPath_){
		return null;
	}
	
	private static class Holder{
		static CurrencyConverter instance_ = new CurrencyConverter();
	}
	
	public static CurrencyConverter getInstance(String ratesPath){
		ratesPath_ = ratesPath;
		return Holder.instance_;
	}
	
	public double convertCurrency(Currency from, Currency to){
		
		double toEUR = rates_.get(from);
		return  (to == Currency.EUR)? toEUR : (toEUR/rates_.get(to)); 
	}
	
}

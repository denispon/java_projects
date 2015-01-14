package currency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CurrencyConverter {
	
	private HashMap<Currency, Double> rates_	 = null;
	private static String             ratesPath_ = null;
	
	private CurrencyConverter(){
		createRateMap();	
	}
	
	private void createRateMap(){
		rates_ = new HashMap<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ratesPath_));
			String line = null;
		    while ((line = reader.readLine()) != null) {
		    	addDataToRateContainer(line);
		    }
		    
		} catch(CurrencyNotExists e)      { e.what();}
		  catch (FileNotFoundException e) {	e.printStackTrace();}
		  catch (IOException e)           { e.printStackTrace();}
	}
	
	
	/*
	 * go over rates.txt file and add currency and its rate to UER 
	 * to rates_ container.
	 * if some currency is not supported - throw CurrencyNotExist exception. 
	 */
	private void addDataToRateContainer(final String line){
		String[] strArr = line.split("=");		
		Currency currency = Currency.getCurrencyByName(strArr[0]);
		
		if(currency == null){
			throw new CurrencyNotExists(strArr[0]);
		}
		
		rates_.put(currency, Double.parseDouble(strArr[1]));
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

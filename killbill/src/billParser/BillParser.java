package billParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import currency.Currency;
import currency.CurrencyNotExists;
import killbill.Record;

public class BillParser implements IBillParser{

	@Override
	public void parseBill(String rawBillPath, Object recordContainer) {
		@SuppressWarnings("unchecked")
		ArrayList<Record> records = (ArrayList<Record>)recordContainer;
		fillRecordContainer(rawBillPath, records);
	}
	
	private void fillRecordContainer(String rawBillPath, ArrayList<Record> records){
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rawBillPath));
			String line = null;
		    while ((line = reader.readLine()) != null) {
		    	records.add(addDataToRecordContainer(line));
		    }
		    
		} catch(CurrencyNotExists e)      { e.what();}
		  catch (FileNotFoundException e) {	e.printStackTrace();}
		  catch (IOException e)           { e.printStackTrace();}
	}
	
	private Record addDataToRecordContainer(final String line){
		
		String[] strArr = line.split(":");
		Currency currency = Currency.getCurrencyByName(strArr[3]);
		
		if(currency == null){
			throw new CurrencyNotExists(strArr[3]);
		}
		
		Record record = new Record(strArr[0], currency, Double.parseDouble(strArr[1]),
				                                              Double.parseDouble(strArr[2]));
		return record;
	}

}

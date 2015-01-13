package killbill;

import java.util.ArrayList;

public class KillBillProgram implements IReportCreator {

	final ArrayList<Record> 	records_;
	String 						rawReportPath_;
	String						ratesPath_;
	final ReportFactory 		reportFactory_ ;
	Currency 					wantedCurrency_;
	CurrencyConverter			currencyConverter_;
	
	@Override
	public Report getReport(String[] reportRequests) {
		
	}

	private createCurrencyConverter(){
		currencyConverter_ = CurrencyConverterFactory.getCurrencyConverter(ratesPath_); 
	}



}

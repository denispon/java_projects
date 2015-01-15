package killbill;

import java.util.ArrayList;

import calculator.Calculator;
import calculator.ICalculator;
import billParser.BillParser;
import billParser.IBillParser;
import report.IReportCreator;
import report.Report;
import report.ReportCreator;
import currency.Currency;
import currency.CurrencyConverter;

public class KillBillProgram {

	ArrayList<Record> 			records_;
	String 						rawReportPath_;
	String						ratesPath_;
	Currency 					reqCurrency_;
	CurrencyConverter			currencyConverter_;
	IBillParser					billParser_;
	IReportCreator 				reportCreator_;
	ICalculator			        calculator_;
	

	public Report getReport(final String rawReportPath, final String ratesPath,
			final Currency reqCurrency, final String reportName					){
		
		init(rawReportPath, ratesPath, reqCurrency);
		billParser_.parseBill(rawReportPath, records_);
		calculateTotalPrice();
		return reportCreator_.createReport(records_, reportName);
	}

	private void init(final String rawReportPath, final String ratesPath, final Currency reqCurrency){
		records_		   = new ArrayList<>();	
		rawReportPath_     = rawReportPath;
		ratesPath_         = ratesPath;
		reqCurrency_       = reqCurrency;	
		currencyConverter_ = CurrencyConverter.getInstance(ratesPath_); 
		billParser_        = new BillParser();
		reportCreator_     = new ReportCreator();
		calculator_		   = new Calculator();	
	}
	
	private void calculateTotalPrice(){
		
		for(Record record : records_){
			double rate = currencyConverter_.convertCurrency(record.currency_, reqCurrency_);
			record.totalPrice_  = rate * calculator_.calculate(record);
		}
	}
	

}

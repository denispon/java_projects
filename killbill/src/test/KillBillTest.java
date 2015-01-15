package test;

import static org.junit.Assert.*;

import java.io.IOException;

import killbill.KillBillProgram;

import org.junit.BeforeClass;
import org.junit.Test;

import report.Report;
import currency.Currency;

public class KillBillTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		
		KillBillProgram killbill = new KillBillProgram();
		Report report = killbill.getReport("billFiles/bill.txt", 
				  "ratesFiles/rates.txt", Currency.RUB, "the_report.txt");
		report.display();
		
		try {
			report.writeReportToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package report;

import java.util.ArrayList;

import killbill.Record;

public class ReportCreator implements IReportCreator{

	@Override
	public Report createReport(final ArrayList<Record> records, final String reportName) {
		
		Report report = new KillBillReport(reportName);
		
		for(Record record: records){
			report.addRecord(record.toString());
		}
		
		return report;
	}

	
}

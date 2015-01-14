package report;

import java.util.ArrayList;

import killbill.Record;

public interface IReportCreator {
	abstract public Report createReport(ArrayList<Record> records, final String reportName);
}

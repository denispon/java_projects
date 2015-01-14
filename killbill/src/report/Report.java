package report;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class Report {
	
	
	final ArrayList<String> records_;
	static final String 	reportDir_ = "reportFiles";
	final String			reportName_;
	
	
	public Report(final String reportName){
		
		reportName_			= reportName;
		records_        	= new ArrayList<String>();
		
		
	}
	
	void addRecord(String record){
		records_.add(record);
	}
	
	public void writeReportToFile() throws IOException{
		
		BufferedWriter writer = null;
		Path reportPath_     = Paths.get(reportDir_, reportName_);
		Charset charset = Charset.forName("US-ASCII");
		
		writer = Files.newBufferedWriter(reportPath_, charset);
		
		for(String s: records_){
			writer.write(s, 0, s.length());
			writer.newLine();
		}
	}
	
	abstract public void display();
}

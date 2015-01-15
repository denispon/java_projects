package report;


public class KillBillReport extends Report {

	public KillBillReport(String reportName) {
		super(reportName);
	}

	@Override
	public void display() {
		for(String s : records_){
			System.out.println(s);
		}
	}
	
}

package killbill;

import java.util.ArrayList;

public abstract class Report {
	
	
	final ArrayList<String> records_;
	
	public Report(){
		records_ = new ArrayList<String>();
	}
	
	void addRecord(String record){
		records_.add(record);
	}
	
	abstract public void display();
}

package killbill;

public class KillBillReport extends Report {

	
	@Override
	public void display() {
		for(String s : records_){
			System.out.println(s);
		}

	}
}

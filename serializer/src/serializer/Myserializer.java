package serializer;

import java.io.Serializable;

public class Myserializer implements Serializable{
	private String			name_;
	private String 			address_;
	private transient int 	SSN_;
	private int				number_;
	private static int 		s_id  = 0;
	
	public Myserializer(final String name, final String address, int number){
		name_    =    name;
		address_ =    address;
		number_  =    number;
		SSN_     =    100;
	}
	
    public void mailCheck()
    {
      System.out.println("Mailing a check to " + name_ + " " + address_);
    }

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("name: ");
		sb.append(name_);
		sb.append(" address: ");
		sb.append(address_);
		sb.append(" SSN: ");
		sb.append(SSN_);
		sb.append(" number: ");
		sb.append(number_);
		
		return sb.toString();
}
   
}

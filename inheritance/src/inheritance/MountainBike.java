package inheritance;

public class MountainBike extends Bicycle{
	// the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    @Override
    public String toString() {
    	return "MountainBike [seatHeight=" + seatHeight + "]" + super.toString();
    }
    
    public static void main(String[] args){
    	Bicycle bike = new Bicycle(2, 4, 5);
    	Bicycle mountBike = new MountainBike(10, 5, 10, 0);
    	System.out.println(bike.toString());
    	System.out.println(mountBike.toString());
    }

    
}


public abstract class Animal{

    private int simID;
    private Location location;
    private boolean full;
    private boolean rested;


    public Animal(){
        this.simID = 0;
        this.location = new Location();
        this.full = false;
        this.rested = true;
        
    }//end empty constructor

    public Animal(int simID, Location location) {
        this.simID = simID;
        this.location = location;
        full = false;
        rested = true;
    }//end preferred constructor

    public int getSimID() {
        return simID;
    }//end getSimID

    public void setSimID(int simID) {
        this.simID = simID;  
    }//end setSimID

    public int getLocation() {
         return getLocation();
    }//end getLocation

    public void setLocation(Location location) {
        this.location = location;
    }//end setLocation

    public boolean getIsFull() {
        return full;
    }//end getIsFull

    public void setIsFull(boolean full) {
        this.full = full;
    }//end setIsFull

    public boolean getRested() {
        return rested;
    }//end getRested

    public void setRested(boolean rested) {
        this.rested = rested;
    }//end SetRested

	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
				+ "]";
	}//end ToString
	
}//end class
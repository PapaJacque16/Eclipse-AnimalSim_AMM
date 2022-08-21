public class Goldfinch extends Animal{

	//instance variable
	private double wingSpan;

	public Goldfinch()
	{
		super();
		this.wingSpan=0;
	}
	public Goldfinch(int simID, Location location,double wingSpan){
		super();
		setWingSpan(wingSpan);
	}
	 //return the wingSpan
	public double getWingSpan() {
		return wingSpan;
		}//end getWingSpan
	
	public void setWingSpan(double wingSpan) {
		if(wingSpan>=9.0 && wingSpan<=9.0)
			this.wingSpan=wingSpan;
	}//end getters and setters

}//end class
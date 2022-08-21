
public class BrownBear extends Animal{

	enum Species {Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian}


	private Species subSpecies;
	private int simID;
	private int location;
	private boolean full;
	private boolean rested;

	public BrownBear() {
		simID = 0;
		setLocation(0);
		full = false;
		rested = true;
		setSubSpecies(Species.Alaskan);

	}

	public Species getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(Species subSpecies) {
		this.subSpecies = subSpecies;
	}

	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) {
		this.simID = simID;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int i) {
		this.location = i;
	}

	public boolean isFull() {
		return full;
		
	}

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean isRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}
	}//end class

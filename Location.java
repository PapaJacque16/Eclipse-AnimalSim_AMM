
public class Location extends Animal{


private int xCoord;
private int yCoord;

// empty argument constructor
public Location() {
 xCoord = 0;
 yCoord = 0;
}
	
 // The preferred constructor
 public Location(int xCoord, int yCoord) {
   if (xCoord < 0 || yCoord < 0) {
    
   }
   this.xCoord = xCoord;
   this.yCoord = yCoord;
 }

 public void update(int x, int y) {
   if (x < 0 || y < 0) {
	   
   }
   xCoord = x;
   yCoord = y;
 }

 public int[] getCoordinates() {
   return new int[] {xCoord, yCoord};
	}//end getCoordinates
 
}// end class 
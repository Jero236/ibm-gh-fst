package fst;

interface BicycleParts{
	public int tyres = 2;
	public int maxSpeed = 40;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment) ;
}

class Bicycle implements BicycleParts, BicycleOperations{
	int gears;
	int currentSpeed;
	Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void applyBrake(int decrement){
		currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
	}
	
	public void speedUp(int increment) {
		currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}	
}

class MountainBike extends Bicycle {
	int seatHeight;
	MountainBike(int gears,int seatHeight, int currentSpeed){
		super(gears,currentSpeed);
		this.seatHeight=seatHeight;
	}
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + 
	    		"\nSeatHeight is " + seatHeight);
	}	
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mountainBike = new MountainBike(3, 0, 20);
		System.out.println(mountainBike.bicycleDesc());
		mountainBike.speedUp(20);
		mountainBike.applyBrake(5);
		System.out.println(mountainBike.bicycleDesc());

	}

}

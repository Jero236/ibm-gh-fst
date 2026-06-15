package fst;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
    Plane(int maxPassengers){
    	this.passengers=new ArrayList<>();
    	this.maxPassengers=maxPassengers;
    }
    
    void onboard(String name){
    	passengers.add(name);
    }
    
    Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    List<String> getPassengers(){
    	return passengers;
    }
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(10);
		plane.onboard("jero");
		plane.onboard("hero");
		plane.onboard("mero");
		plane.onboard("oero");

		System.out.println("Plane took off at: " + plane.takeOff());
		//Print list of people on board
		System.out.println("People on the plane: " + plane.getPassengers());
		//Flying.....
		Thread.sleep(5000);
		//Plane has landed
		plane.land();
		//Plane lands
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}

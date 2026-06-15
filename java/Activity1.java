package fst;

class Car{
	String color;
	String transition;
	int make;
	int tyers;
	int doors;
	
	Car(String color, String transition, int make, int tyers, int doors){
		this.color=color;
		this.transition=transition;
		this.make=make;
		this.tyers=tyers;
		this.doors=doors;
	}
	
	void displayCharacteristics(){
		System.out.println("Color : " + color + " Transition : " + transition + " Make : "
				+ make + " Tyers : " + tyers + " Doors : " + doors);
	}
	
	void accelarate() {
		System.out.println("accelarating...........");
	}
	
	void brake() {
		System.out.println("breaking..........");
	}
	
}

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Car carName = new Car("black","manual",2006,4,4);
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
	}

}

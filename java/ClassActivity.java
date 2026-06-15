package fst;

class Human{
	int boy,girl,robot;
	Human(int boy,int girl,int robot){
		this.boy=boy;
		this.girl=girl;
		this.robot=robot;
	}
	void walking() {
		System.out.println("walking");
	}
	void talking() {
		System.out.println("talking");
	}
	void displayPopulation() {
		System.out.print("Total Population : ");
		System.out.println(boy + girl + robot);
	}
}

class Boy extends Human{
	int boy,girl,robot;
	Boy(int boy, int girl, int robot){
		super(boy,girl,robot);
	}
}

class Girl extends Human{
	int boy,girl,robot;
	Girl(int boy, int girl, int robot){
		super(boy,girl,robot);
	}
}

class Robot extends Human{
	int boy,girl,robot;
	Robot(int boy, int girl, int robot){
		super(boy,girl,robot);
	}
}

public class ClassActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boy boy = new Boy(3,3,3);
		boy.displayPopulation();
		boy.walking();
		boy.talking();

	}

}

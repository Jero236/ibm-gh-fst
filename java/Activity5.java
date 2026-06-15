package fst;

abstract class Book{
	String title;
	abstract void setTitle(String title);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
}

public class Activity5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Harry Potter";
		MyBook myBook = new MyBook();
		myBook.setTitle(title);	
		System.out.println("The title is: " + myBook.getTitle());
	}
}

package fst;

class CustomException extends Exception{
	private String message = null;
	CustomException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	void exceptionTest(String msg) throws CustomException {
		if(message == null) {
			throw new CustomException("value is null");
		} else {
			System.out.println(message);
		}
	}
}

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException customException = new CustomException("jero");
		try {
			customException.exceptionTest(customException.getMessage());
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}

}

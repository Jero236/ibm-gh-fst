package fst;

public class Activity2 {
	
	public static boolean check(int arr[]) {
		int i=0;
		int sum =0;
		for(i=0; i<=arr.length-1;i++) {
			if(arr[i] == 10) {
				sum += arr[i];
			}
		}
		if (sum == 30) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 77, 10, 54, -11, 10};
		System.out.println(check(arr));
	}

}

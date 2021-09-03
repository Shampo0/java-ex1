package ex;

public class ex4 {

	public static void main(String[] args) {
		int[] arr = { 5, 20, 30, 55, 60 };

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
		}
		System.out.println("total = " + total);
	}

}

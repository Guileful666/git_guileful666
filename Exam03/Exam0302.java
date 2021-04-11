package Exam03;

public class Exam0302 {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 4, 2, 5};
		int[] copy = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			copy[i]= arr[i];

		}
		System.out.println("copy[0]=" +copy[0]);
		System.out.println("copy[1]=" +copy[1]);
		System.out.println("copy[2]=" +copy[2]);
		System.out.println("copy[3]=" +copy[3]);
		System.out.println("copy[4]=" +copy[4]);
	}

}

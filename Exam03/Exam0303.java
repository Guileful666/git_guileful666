package Exam03;

public class Exam0303 {

	public static void printArray(int[] arr) {
		

		int j =-1;
		//배열의 길이 -1 해야 끝 방에서부터 시작.
		for(int i = arr.length - 1 ; i >= 0; i--) {
			
			j += 1;
		
			System.out.println("arr[" +j+ "]=" +arr[i]);
		}
		

	}
	public static void main(String[] args) {
		
		int[] arr = {1, 9, 4, 2, 5};
		printArray(arr);
		


	}

}

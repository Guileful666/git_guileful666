package Exam03;

public class HelloJava0307 {

	public static void main(String[] args) {
		//단가 - 수량
		int[][] inven = {{500, 291}, {320, 586}, {100, 460}, {120, 558}, {92, 18}, {30, 72}};
		
		int total = 0;
		int sum = 0;
		for (int i = 0; i < inven.length; i++) {			
			sum += inven[i][0] * inven[i][1];
				 total = sum *90/100;
			}
	
		System.out.println("총 골드의 합:" + total + "G");
		
	}
	

}

package Exam03;

public class HelloJava0310 {

	public static void main(String[] args) {
		int[] price = { 38000, 20000, 17900, 17900 };
		int[] qty = { 6, 4, 3, 5 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < price.length; i++) {
			sum = price[i] * qty[i];
			if (sum >= 80000) {
				count++;
			}
		}
		System.out.println("무료배송 항목: " + count + "건");
	}
}

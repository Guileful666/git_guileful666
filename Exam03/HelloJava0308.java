package Exam03;

public class HelloJava0308 {

	public static void main(String[] args) {
		int[] price = { 38000, 20000, 17900, 17900 };
		int[] qty = { 6, 4, 3, 5 };
		int total = 0;

		for (int i = 0; i < price.length; i++) {
			int sum = 0;

			for (int j = 0; j <= i; j++) {
				sum = price[i] * qty[j];

			}
			total += sum;

		}
		System.out.println("전체 결제 금액:" + total + "원");
	}

}

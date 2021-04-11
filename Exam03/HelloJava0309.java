package Exam03;

public class HelloJava0309 {

	public static void main(String[] args) {
		int[] price = { 38000, 20000, 17900, 17900 };
		int[] qty = { 6, 4, 3, 5 };
		int top = 0;
		int sum = 0;
		for (int i = 0; i < price.length; i++) {
			

			for (int j = 0; j <= i; j++) {
				sum = price[i] * qty[j];
				if (sum >= top) {
					top = sum;
				}

			}

		}
		System.out.println("가장 높은 상품금액:" + top + "원");
	}

}

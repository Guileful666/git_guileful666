package Exam03;

import java.util.Arrays;

public class HelloJava0311 {

	public static void main(String[] args) {
		int[] money = { 209000, 109000, 119000, 109000, 94000 };

		System.out.println("상품가격 --> " + Arrays.toString(money));

		for (int i = 0; i < money.length; i++) {
			for (int j = i + 1; j < money.length; j++) {
				if (money[i] > money[j]) {
					int tmep = money[i];
					money[i] = money[j];
					money[j] = tmep;
				}
			}
		}
		System.out.print("낮은가격순 --> ");
		for (int i = 0; i < money.length; i++) {
			if (i < money.length - 1) {
				System.out.print(money[i] + ",");
			} else
				System.out.println(money[i]);
		}
	}
}
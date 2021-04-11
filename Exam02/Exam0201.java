package Exam02;

import java.util.Scanner;

public class Exam0201 {

	public static void main(String[] args) {

		Scanner myHeight = new Scanner(System.in);
		Scanner myWeight = new Scanner(System.in);
		double standardWeight = 0;
		double obesity = 0;
				
		System.out.print("키를 입력하세요 : ");
		int num1 = myHeight.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		int num2 = myWeight.nextInt();
		if(num1 >= 151) {
			standardWeight = (num1 - 110) * 0.9;
		}
		else
		{
			standardWeight = num1 - 100;
		}
		obesity = ((num2 - standardWeight)/standardWeight) * 100;
		if(obesity <= 20) {
			System.out.println("정상(안심)입니다.");
		}
		else if(obesity > 20 && obesity <= 30) {
			System.out.println("경도비만(주의)입니다.");
		}
		else if(obesity > 30 && obesity <= 50) {
			System.out.println("중등도 비만(위험)입니다.");
		}
		else
			System.out.println("고도비만(매우위험)합니다.");
		myHeight.close();
		myWeight.close();
		
	}

}

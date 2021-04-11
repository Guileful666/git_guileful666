package Exam03;

public class HelloJava0306 {

	public static void main(String[] args) {
		//일한 시간
		int [] workTime = { 7, 5, 5, 5, 5, 10, 7 }; //일,월,화,수,목 0123 목은 4
		//총 급여
		int pay = 0;
		for(int i = 0; i < workTime.length; i++) {
			if (i <= 3 ) { 
				pay += workTime[i]*4500;
			}
			else { 
				pay += workTime[i]*5200;
			}
		
		}
		
		System.out.println("일주일 간의 총 급여:" + pay + "원");
	}

}

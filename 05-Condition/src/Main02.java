
public class Main02 {

	public static void main(String[] args) {

		int point = 95;

		// and(&&) -> 두 조건이 모두 참이어야 전체가 참
		if (point > 90 && point <= 100) {
			System.out.println("A학점 입니다.");
		}

		// or(||) -> 두 조건중 하나라도 참이면 전체가 참
		if (point <= 70 || point > 100) {
			System.out.println("범위를 벗어났습니다.");

		}
	}
}

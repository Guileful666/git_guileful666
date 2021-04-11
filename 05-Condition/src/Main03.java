
public class Main03 {

	public static void main(String[] args) {
		
		boolean is_korean = true;
		
		if (is_korean == true) {
			System.out.println("한국인입니다.");
		}
		if (is_korean == false) {
			System.out.println("외국인입니다.");
		}
		//값 자체가 참이므로 성립된다.
		if (is_korean) {
			System.out.println("한국인입니다.");
		}
		if (!is_korean) {
			System.out.println("외국인입니다.");
		}

		boolean is_japanese = false;
		
		if (is_japanese != true) {
			System.out.println("일본사람이 아닙니다.");
		}
		if (is_japanese != false) {
			System.out.println("일본사람 입니다.");
		}
		
		//값 자체가 거짓이므로 성립되지 않는다.
		if (is_japanese) {
			System.out.println("일본사람이 아닙니다.");
		}
		//거짓을 부정하였기 때문에 참이다.
		if (!is_japanese) {
			System.out.println("일본사람입니다.");
		}
	}

}

import study.java.helper.RegexHelper2;

public class Main02 {

	public static void main(String[] args) {
		String name = "자바돌이";
		String age = "19";
		String email = "user@java.net";
		String phone = "01012345678";
		
		if(!RegexHelper2.getInstance().isKor(name)) {
			System.out.println("이름은 한글로 입력해 주세요.");
			return;
		}
		if(!RegexHelper2.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해 주세요.");
			return;
		}
		if(!RegexHelper2.getInstance().isEmail(email)) {
			System.out.println("이메일이 잘못된 형식입니다.");
			return;
		}
		if(!RegexHelper2.getInstance().isCellPhone(phone)) {
			System.out.println("핸드폰 번호가 잘못된 형식입니다.");
			return;
		}
		
		
		
		System.out.println("회원가입 절차를 진행합니다.");

	}

}

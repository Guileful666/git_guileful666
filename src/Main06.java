
public class Main06 {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("91~100점사이 입니다.");
		case 'B':
			System.out.println("81~90점사이 입니다.");
		case 'C':
			System.out.println("71~80점사이 입니다.");
		default:
			System.out.println("70점이하입니다.");
		}
	}

}

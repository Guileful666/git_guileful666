
public class Main05 {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("91~100점사이 입니다.");
			break;
		case 'B':
			System.out.println("81~90점사이 입니다.");
			break;
		case 'C':
			System.out.println("71~80점사이 입니다.");
			break;
		default:
			System.out.println("70점이하입니다.");
			break;
		}

	}

}

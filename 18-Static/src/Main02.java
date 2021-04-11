public class Main02 {

	public static void main(String[] args) {
		Calc loader1 = Calc.getInstance(); //별도의 객체에 참조시키는 경우.(잠깐 사용한다 = 참조)
		loader1.plus(100, 50);  //메서드 사용
		
		Calc.getInstance().minus(100, 50); //메서드 체인

	}

}

package Exam04;

class square {

	private int width; //가로
	private int height; //세로
	
	public square(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return (width * height);
	}
	
	public int getRound() {
		return((width*2) + (height *2));
	
	}



}

public class Exam0401 {

	public static void main(String[] args) {
		// 사각형의 가로, 세로 길이를 생성자에 전달한다.
		square s = new square(3, 2);

		// 넓이를 구해서 리턴하는 메서드 호출
		System.out.println("사각형의 넓이 ->" + s.getArea() + "제곱cm");
		// 둘레의 길이를 구해서 리턴하는 메서드 호출
		System.out.println("사각형의 둘레 -> " + s.getRound() + "cm");

	}

}

package Exam07;

public class MyMathhelper {

	private static MyMathhelper current;

	public static MyMathhelper getInstance() {
		if (current == null) {
			current = new MyMathhelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private MyMathhelper() {
		super();
	}

	public void gugu(int i) {
		int j = 1;
		int z = 0;
		for (j = 1; j < 10; j++) {
			z = i * j;
			System.out.println(i + "x" + j + "=" + z);

		}
	}
}

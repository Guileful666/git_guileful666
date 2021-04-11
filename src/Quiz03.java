
public class Quiz03 {
	private static String aField = "";
	private String bField = "";
	static {
		aField += "A";
	}
	{
		aField += "B";
		bField += "B";
	}

	public Quiz03() {
		aField += "C";
		bField += "C";
	}

	public void append() {
		aField += "D";
		bField += "D";
	}

	public static void main(String[] argv) {
		System.out.println(aField);
		Quiz03 qb = new Quiz03();
		qb.append();
		System.out.println(aField);
		System.out.println(qb.bField);
	}
}
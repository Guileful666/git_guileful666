public class Main01 {

	public static void main(String[] args) {
		Charactor ch = new Charactor("주인공");
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		ch.pickup();
		
		System.out.println("===================");
		
		Monster mon = new Monster("악당");
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();

	}

}

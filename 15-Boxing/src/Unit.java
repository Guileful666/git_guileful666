public class Unit {
	private String name;

	// alt + shift + s -> Generate Constructor using Fields
	public Unit(String name) {
		super();
		this.name = name;
	}
     //Generate getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println(this.name + " >> 공격준비");
	}
	

}

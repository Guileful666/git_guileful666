public class Army extends Unit {
	public Army(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 지상공격 실행함"); //super도 상관은 없는가? 질문 트릭이라고 한 이유
	}
	public void tank() {
		System.out.println(this.getName() + " >> 탱크 공격");
	}

	

}

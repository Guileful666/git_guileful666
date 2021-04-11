package Exam06;

public class Exam0602 {

	public static void main(String[] args) {
		MemberDao member = new MemberDaoImpl();
		
		member.doJoin();
		member.doLogin();
		member.doUpdate();
		member.getInfo();
		member.doLogout();

	}

}

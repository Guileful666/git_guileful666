import java.sql.Connection;

import study.java.daoex.dao.StudentDao;
import study.java.daoex.dao.impl.StudentDaoImpl;
import study.java.daoex.model.Student;
import study.java.helper.DBHelper;

public class Main01 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		// -->import java.sql.Connection;
		// --> import study.java.helper.DBHelper;
		Connection conn = DBHelper.getInstance().open();

		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}

		// 2) INSERT를 수행할 데이터 생성
		// --> 사용되지 않는 값(deptno)는 0(int)이나 null(String)로 지정한다.
		Student model = new Student(0, "뚬땜이", "ttt01", 4, "9901011111111", "1999-01-11 00:00:00", "055)123-4567", 180, 100, 101, 9908);

		// 3) 데이터 저장
		StudentDao dao = new StudentDaoImpl(conn);
		int result = dao.insert(model);

		// 4) 결과 판별
		System.out.println(result + "번 데이터 저장됨");
		// 5) DB 접속 해제
		DBHelper.getInstance().close();

	}

}

import java.sql.Connection;

import study.java.daoex.dao.StudentDao;
import study.java.daoex.dao.impl.StudentDaoImpl;
import study.java.daoex.model.Student;
import study.java.helper.DBHelper;

public class Main03 {

	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		Connection conn = DBHelper.getInstance().open();

		if (conn == null) {
			System.out.println("데이터베이스 접속 실패");
			return;
		}

		// 2) UPDATE를 수행할 데이터 생성
		Student model = new Student(20104, "뚬땜이", "ttt01", 4, "9901011111111", "1999-01-11 00:00:00", "055)123-4567", 180, 100, 101, 9908);

		// 3) 데이서 수정
		StudentDao dao = new StudentDaoImpl(conn);
		int result = dao.update(model);

		// 4) 결과 판별
		System.out.println(result + "개의 데이터 수정됨");

		// 5) DB접속해제
		DBHelper.getInstance().close();

	}

}

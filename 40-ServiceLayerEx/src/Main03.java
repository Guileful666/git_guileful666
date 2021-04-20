import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentService;
import study.myschool.service.impl.DepartmentServiceImpl;

public class Main03 {

	public static void main(String[] args) {
		/**처리 결과를 기록할 Log4J 객체 생성 */
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main03.class.getName());
		
		/** 삭제될 데이터를 담고 있는 Beans 객체 생성 */
		// --> import study.java.myschool.model.Department;
		Department dept = new Department();
		dept.setDeptno(313);
		
		/**데이터베이스 접속 */
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/**데이터 처리 수행 */
		//비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		DepartmentService departmentService = new DepartmentServiceImpl(session);
		
		try {
			//학과 삭제하기
			departmentService.deleteDepartment(dept);
			//저장결과를 데이터베이스에 반영하기
			session.commit();
			//처리 결과를 로그에 기록하기
			logger.debug("데이터 삭제 완료");
		} catch (NullPointerException e) {
			//수정된 데이터가 없는 경우
			logger.error("삭제된 데이터가 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			// SQL문에 문제가 있는 경우
			//데이터베이스로부터 전달되는 에러메시지를 상세히 확인하기 위하여
			//e.getMessage() 리턴값을 함께 기록한다.
			logger.error("데이터 삭제에 실패했습니다." + e.getMessage());
			e.printStackTrace();
		}
		/** 데이터베이스 접속 해제 */
		session.close();

	}

}

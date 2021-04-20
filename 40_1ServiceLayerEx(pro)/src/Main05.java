import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;
import study.java.myschool.service.ProfessorService;
import study.myschool.service.impl.ProfessorServiceImpl;

public class Main05 {

	public static void main(String[] args) {
		/**처리 결과를 기록할 Log4J 객체 생성 */
		// --> import org.apache.logging.log4j.LogManager;
		// --> import org.apache.logging.log4j.Logger;
		Logger logger = LogManager.getFormatterLogger(Main03.class.getName());
		
		/** 조회할 데이터의 일련번호를 저장하고 있는 Beans 객체 생성 */
		// --> import study.java.myschool.model.Department;
		Professor dept = new Professor();
		dept.setProfno(9924);
		
		/**데이터베이스 접속 */
		// --> import org.apache.ibatis.session.SqlSession;
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		
		/**데이터 처리 수행 */
		//비지니스 로직을 위한 Service 객체 생성
		// --> import study.java.myschool.service.DepartmentService;
		// --> import study.java.myschool.service.impl.DepartmentServiceImpl;
		ProfessorService professorService = new ProfessorServiceImpl(session);
		//조회 결과가 저장될 객체 선언 --> import java.util.List;
		List<Professor> list = null;
		
		try {
			//학과 조회하기
			list = professorService.getProfessorList();
			//조회결과를 반복문으로 스캔하면서 출력한다.
			for(int i = 0; i < list.size(); i++) {
				Professor temp = list.get(i);
				logger.debug(String.format("조회결과[%d] >> %s", i, temp.toString()));
			}
		} catch (NullPointerException e) {
			//수정된 데이터가 없는 경우
			logger.error("조회된 데이터가 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			// SQL문에 문제가 있는 경우
			//데이터베이스로부터 전달되는 에러메시지를 상세히 확인하기 위하여
			//e.getMessage() 리턴값을 함께 기록한다.
			logger.error("데이터 조회에 실패했습니다." + e.getMessage());
			e.printStackTrace();
		}
		/** 데이터베이스 접속 해제 */
		session.close();


	}

}

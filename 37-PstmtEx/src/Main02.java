import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import study.java.helper.DBHelper;

public class Main02 {

	public static void main(String[] args) {
		
		/** 삭제할 데이터와 SQL 구문 정의하기 */
		//삭제할 데이터
		int deptno = 301;
		
		//'department' 테이블에서 301번 학과를 삭제하기 위한 SQL 템플릿
		String sql = "DELETE FROM department WHERE deptno=?";
		
		/** DBHelper를 통한 DB 접속 처리 */
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();

		/** SQL 구문 실행하기 */
		// SQL문의 템플릿을 사용하여 쿼리 실행을 준비하는 객체
		//import java.sql.PreparedStatement;
		PreparedStatement pstmt = null;

		// 결과값 ( 저장된 데이터의 수)
		int result = 0;


		try {
			// pstmt 객체 할당 --> AUTO_INCREMENT 조회 옵션 사용함
			// import java.sql.Statement;
			//--> INSERT 처리와 비교해 보세요.
			pstmt = conn.prepareStatement(sql);
			
			//템플릿에 데이터 설정
			pstmt.setInt(1, deptno);
			
			//SQL문 실행하기 --> 결과 행 리턴됨
			result = pstmt.executeUpdate();
			
			//생성된 AUTO_INCREMENT 값 얻기
			
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());
		} finally {
			if (pstmt != null) {
				//객체 닫기 
				try {
					pstmt.close();
				} catch (SQLException e) {
					
				}
			}
		}
		/** 결과 출력 */
		System.out.println(result + "Recort Deleted");
		/** DB 접속 해제 */
		db.close();

	}

}

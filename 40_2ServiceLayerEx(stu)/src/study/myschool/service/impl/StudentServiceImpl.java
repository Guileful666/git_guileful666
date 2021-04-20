package study.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.model.Student;
import study.java.myschool.service.StudentService;

public class StudentServiceImpl implements StudentService {

	/** MyBatis의 Mapper를 호출하기 위한 SqlSession 객체 */
	// --> import org.apache.ibatis.session.SqlSession;
	private SqlSession session;

	/** 생성자. SqlSession을 전달받는다. */
	public StudentServiceImpl(SqlSession session) {
		this.session = session;
	}

	@Override
	public Student addStudent(Student params) throws NullPointerException, Exception {
		int row_count = session.insert("StudentMapper.add_student", params);

		// 저장된 데이터의 행 수가 없을 경우 강제로 예외를 발생시킨다.
		if (row_count == 0) {
			throw new NullPointerException();
		}
		return session.selectOne("StudentMapper.get_student_item", params);
	}

	@Override
	public Student editStudent(Student params) throws NullPointerException, Exception {
		int row_count = session.insert("StudentMapper.edit_student", params);

		// 수정된 데이터의 행 수가 없을 경우 강제로 예외를 발생시킨다.
		if (row_count == 0) {
			throw new NullPointerException();
		}
		return session.selectOne("StudentMapper.get_student_item", params);
	}

	/** 학과 삭제하기 */
	@Override
	public void deleteStudent(Student params) throws NullPointerException, Exception {
		
		Student stud = new Student();
		stud.setStudno(params.getStudno());
		session.delete("StudentMapper.remove_student", stud);

	}

	/** 학과 데이터 조회하기 (단일행) */
	@Override
	public Student getStudentItem(Student params) throws NullPointerException, Exception {
		Student item= session.selectOne("StudentMapper.get_student_item", params);
		
		if (item == null) {
			throw new NullPointerException();
		}
		return item;
	}

	/**학과 데이터 조회 (다중행) */
	@Override
	public List<Student> getStudentList() throws NullPointerException, Exception {
		List<Student> list = session.selectList("StudentMapper.get_student_list", null);
		
		if(list == null) {
			throw new NullPointerException();
		}
		return list;
	}

}

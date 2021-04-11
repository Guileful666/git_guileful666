package Exam09;

import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		ContactDao dao = new FileContactDaoImpl();
		List<Contact> list = dao.getGradeList();
		
		for (int i = 0; i < list.size(); i++) {
			Contact item = list.get(i);
			System.out.println(item.toString());
		}

	}

}

package Exam09;

import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		ContactDao dao = new JsonContactDaoImpl();
		List<Contact> list = dao.getGradeList();
		
		for (int i = 0; i < list.size(); i++) {
			Contact item = list.get(i);
			System.out.println(item.toString());
		}

	}

}

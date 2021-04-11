package Exam09;

import java.util.ArrayList;
import java.util.List;
public class FileContactDaoImpl implements ContactDao {
	

	public FileContactDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("------" + clsName + "------");
	}

	@Override
	public List<Contact> getGradeList() {
	
		List<Contact> list = null;
		
	
		String source = FileHelper.getInstance().readString("res/total.csv", "euc-kr");
		
		
		if (source == null) {
			return null;
		}
		
	
		list = new ArrayList<Contact>();
		
		
		String[] data = source.split("\n");
		
	
		for (int i = 0; i < data.length; i++) {
		
			String line_string = data[i].trim();
			
		
			String[] line_data = line_string.split(",");
			
		
			String name = line_data[0];
			String phone = line_data[1];
			String email = line_data[2];

			
			
			Contact item = new Contact(name, phone, email);
			list.add(item);
			
		}
		
	
		return list;
	}
	
	

}

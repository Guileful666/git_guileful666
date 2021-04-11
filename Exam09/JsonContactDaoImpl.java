package Exam09;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonContactDaoImpl implements ContactDao {

	public JsonContactDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("------" + clsName + "------");
	}

	@Override
	public List<Contact> getGradeList() {

		List<Contact> list = null;

		String source = FileHelper.getInstance().readString("res/total.json", "utf-8");

		if (source == null) {
			return null;
		}

		list = new ArrayList<Contact>();

		JSONObject json = new JSONObject(source);

		JSONArray grade = json.getJSONArray("Contact");

		for (int i = 0; i < grade.length(); i++) {

			JSONObject temp = grade.getJSONObject(i);

			String name = temp.getString("name");
			String phone = temp.getString("phone");
			String email = temp.getString("email");

			Contact item = new Contact(name, phone, email);
			list.add(item);
		}

		return list;
	}

}

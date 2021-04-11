import org.json.JSONObject;

import study.java.helper.FileHelper;

public class Main02 {

	public static void main(String[] args) {
		//파일로부터 JSONOnject객체 생성
		String source = FileHelper.getInstance().readString("res/02.json", "utf-8");
		JSONObject json = new JSONObject(source);
		
		//각 key에 대한 value들은 개별적으로 추출.
		String title = json.getString("title");
		String description = json.getString("description");
		String pubDate = json.getString("pubDate");
		
		//결과출력
		System.out.println("title=" + title);
		System.out.println("description=" + description);
		System.out.println("pubDate=" + pubDate);

	}

}

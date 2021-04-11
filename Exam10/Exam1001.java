package Exam10;

import java.util.List;


public class Exam1001 {

	public static void main(String[] args) {
		String keyword = "자바프로그래밍";
		
		WebSearchDao dao = new WebSearchDaoImpl();
		List<WebSearchItem> list = dao.getSearchList(keyword);
		
		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		
		for(int i = 0; i < list.size(); i++) {
			WebSearchItem item = list.get(i);
			String title = replaceTag(item.getTitle());
			String url = replaceTag(item.getUrl());
			String content = replaceTag(item.getContents());
			
			System.out.println("[제목] " + title);
			System.out.println("[URL]" + url);
			System.out.println("[내용]" + content);
			System.out.println();
		}

	}
	public static String replaceTag(String str) {
		return str.replace("<b>", "")
				  .replace("</b>", "")
				  .replace("&amp;", "&")
				  .replace(",", " ");
	}

}

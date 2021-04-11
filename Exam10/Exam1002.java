package Exam10;

import java.util.List;

public class Exam1002 {

	public static void main(String[] args) {
		String keyword = "자바프로그래밍";

		WebSearchDao dao = new WebSearchDaoImpl();
		List<WebSearchItem> list = dao.getSearchList(keyword);

		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		String text = "";
		for (int i = 0; i < list.size(); i++) {
			WebSearchItem item = list.get(i);

			String title = replaceTag(item.getTitle());
			String publisher = replaceTag(item.getPublisher());
			int price = item.getPrice();
			int sale_price = item.getSale_price();
			text += title + "," + publisher + "," + price + "," + sale_price + "\n";

			System.out.println(title);
			System.out.println(publisher);
			System.out.println(price);
			System.out.println(sale_price);
			System.out.println();
		}
		String ms = "자바프로그래밍";
		String fileName = ms + ".csv";

		boolean is = FileHelper.getInstance().writeString(fileName, text, "euc-kr");

		if (is) {
			System.out.println(fileName + "저장성공");
		}

	}

	public static String replaceTag(String str) {
		return str.replace("<b>", "").replace("</b>", "").replace("&amp;", "&").replace(",", " ");
	}

}

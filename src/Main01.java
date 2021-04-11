import java.util.List;

import Helper.FileHelper;
import Jejuwifi.dao.WifiDao;
import Jejuwifi.dao.Impl.WifiDaoImpl;
import Jejuwifi.model.WifiItem;



public class Main01 {

	public static void main(String[] args) {
		String keyword = "20170810"; //원하는 날짜 입력하면 지역별 wifi 사용량 나옴, 2016-11-11 ~ 2020-12-07

		WifiDao dao = new WifiDaoImpl();
		List<WifiItem> list = dao.getSearchList(keyword);

		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		String temp = "";
		for (int i = 0; i < list.size(); i++) {
			WifiItem item = list.get(i);

			String baseDate = item.getBaseDate(); //날짜
			String apGroupName = item.getApGroupName(); //제주도지역명
			String uploadBytes = item.getUploadBytes(); //wifi를 이용한 업로드 수
			String downloadBytes = item.getDownloadBytes(); //wifi를 이용한 다운로드 수
			String sessionTime = item.getSessionTime(); // wifi 사용시간
			String userCount = item.getUserCount(); //wifi 사용자수
			temp += baseDate + "," +"지역명: "+ apGroupName + "," + "업로드 수:" + uploadBytes + "," + "다운로드 수: " + downloadBytes +  ","+ "이용시간: "+ sessionTime + "," + "사용자 수: " + userCount +  "\n";

			System.out.print(temp);
			
		}
		String ms = "제주지역WIFI";
		String fileName = ms + ".csv";

		boolean is = FileHelper.getInstance().writeString(fileName, temp, "euc-kr");

		if (is) {
			System.out.println(fileName + "저장성공");
		}

	}


	}


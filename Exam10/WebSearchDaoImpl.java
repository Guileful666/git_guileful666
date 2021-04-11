package Exam10;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class WebSearchDaoImpl implements WebSearchDao {

	@Override
	public List<WebSearchItem> getSearchList(String keyword) {
		List<WebSearchItem> list = null;
		
		//검색어
		String search = null;
		
		/** 한글일 경우 URLEncoding 처리가 되어야 한다. */
		try {
			search = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Kakao OpenAPI 주소
		String url = "https://dapi.kakao.com/v3/search/book?query=" + search;
		
		//발급받은 REST API 키를 "KakaoAK REST_API_키"형식으로 정의한다. (공백주의)
		Map<String, String> header = new HashMap<String, String>();
		header.put("Authorization", "KakaoAK d95dfeb4b204a826d02ab7d2de74dce3");
		
		//JSON파일을 읽어서 객체로 변환
		//-->URL과 HTTP Header 데이터를 함께 전달한다.
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", header);
		
		//통신결과가 없다면 처리 중단
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		//통신에 성공하였으므로, 리턴할 List 할당
		list = new ArrayList<WebSearchItem>();
		
		//통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		//원하는 데이터에 접근하기
		JSONArray documents = json.getJSONArray("documents");
		
		//배열의 항목 수 만큼 반복
		for(int i = 0; i < documents.length(); i++) {
			//배열의 각 요소 추출
			JSONObject item = documents.getJSONObject(i);
			JSONArray array1 = item.getJSONArray("authors");
			String authors = "";
			for(int j = 0; j < array1.length(); j++) {
				authors += array1.getString(j);
			}
			JSONArray array2 = item.getJSONArray("translators");
			String translators = "";
			for(int j = 0; j < array2.length(); j++) {
				translators += array2.getString(j);
			}
			//값 추출
			String contents = item.getString("contents");
			String datetime = item.getString("datetime");
			int price = item.getInt("price");
			int sale_price = item.getInt("sale_price");
			String isbn = item.getString("isbn");
			String publisher = item.getString("publisher");
			String status = item.getString("status");
			String thumbnail = item.getString("thumbnail");
			String title = item.getString("title");
			String url1 = item.getString("url");
			
			//추출한 값을 객체화 하여 List에 추가
			list.add(new WebSearchItem(authors, contents, datetime, price, sale_price, isbn, publisher, status, thumbnail, title, translators, url1));
		}
		
		return list;
	}

}

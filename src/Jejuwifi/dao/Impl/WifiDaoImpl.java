package Jejuwifi.dao.Impl;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import java.util.List;


import org.json.JSONArray;
import org.json.JSONObject;

import Helper.HttpHelper;
import Helper.JsonHelper;
import Jejuwifi.dao.WifiDao;
import Jejuwifi.model.WifiItem;



public class WifiDaoImpl implements WifiDao {

	@Override
	public List<WifiItem> getSearchList(String keyword) {
		List<WifiItem> list = null;
		
		//검색어
		String search = null;
		
		/** 한글일 경우 URLEncoding 처리가 되어야 한다. */
		try {
			search = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//https://open.jejudatahub.net/api/proxy/1aa9D5DabtDt1at935b1tt5t1D95t5at/{your_projectKey}?{params(key=value)}
		String url = "https://open.jejudatahub.net/api/proxy/1aa9D5DabtDt1at935b1tt5t1D95t5at/eebj2r3j2tbr1bt2122_to22c2berbo1?searchDate=" + search;
		
		//JSON파일을 읽어서 객체로 변환
		//-->URL과 HTTP Header 데이터를 함께 전달한다. getWebData()의 header 부분의 값이 필요하지 않기 때문에 null로 설정
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", null);
		
		//통신결과가 없다면 처리 중단
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		//통신에 성공하였으므로, 리턴할 List 할당
		list = new ArrayList<WifiItem>();
		
		//통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		//원하는 데이터에 접근하기
		JSONArray data = json.getJSONArray("data");
		
		//배열의 항목 수 만큼 반복
		for(int i = 0; i < data.length(); i++) {
			//배열의 각 요소 추출
			JSONObject item = data.getJSONObject(i);
			
			//값 추출
			String baseDate = item.getString("baseDate");
			String apGroupName = item.getString("apGroupName"); 
			String uploadBytes = item.getString("uploadBytes"); 
			String downloadBytes = item.getString("downloadBytes");
			String sessionTime = item.getString("sessionTime");
			String userCount = item.getString("userCount");
		
			//추출한 값을 객체화 하여 List에 추가
			list.add(new WifiItem(baseDate, apGroupName, uploadBytes, downloadBytes, sessionTime, userCount));
		}
		
		return list;
	}

}

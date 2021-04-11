package Exam10;

import java.util.List;


public interface WebSearchDao {
	public List<WebSearchItem> getSearchList(String keyword);

}

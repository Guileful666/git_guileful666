package Jejuwifi.dao;

import java.util.List;

import Jejuwifi.model.WifiItem;

public interface WifiDao {
	public List<WifiItem> getSearchList(String keyword);

}

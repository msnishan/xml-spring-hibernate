package com.jxpath.api;

import java.util.List;

public interface XmlReader {
	
	String get(String fileName, String xPath);
	
	List<String> getList(String fileName, String xPath);
	

}

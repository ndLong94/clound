package vn.com.fpt.boot.commons.utils;

import java.util.List;

import org.springframework.http.HttpHeaders;

import vn.com.fpt.boot.commons.constants.CommonConstants;

public class HttpMessageUtils {

	public static String getRequestLanguage(HttpHeaders httpHeaders) {
		
		List<String> languageHeaders = httpHeaders.get(CommonConstants.HEADER_LANGUAGE);
		
		if(languageHeaders != null && languageHeaders.size() > 0) {
			return languageHeaders.get(0);
		}
		
		return null;
	}
	
	
}

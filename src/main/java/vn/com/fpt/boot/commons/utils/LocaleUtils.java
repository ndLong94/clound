package vn.com.fpt.boot.commons.utils;

import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import vn.com.fpt.boot.commons.constants.CommonConstants;

public class LocaleUtils {
	
	public static Locale getLocale(String langCode) {
		
		Locale locale = null;
		
		if(StringUtils.isEmpty(langCode)) {
			return null;
		}
		
		if(langCode.toUpperCase().equals(CommonConstants.LANGUAGE_VN)) {
			
			locale = new Locale("vn", "VN");
		}
		
		if(langCode.toUpperCase().equals(CommonConstants.LANGUAGE_US)) {
			
			locale = Locale.US;
		}
		
		return locale;
	}
	
}

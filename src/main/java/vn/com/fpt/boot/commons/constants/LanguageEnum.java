package vn.com.fpt.boot.commons.constants;

public enum LanguageEnum {
	
	VN("vn_VN", "VN", "vn"),
	US("en_US", "US", "us");
	
	private String localeCode;
	private String upperLangCode;
	private String lowerLangCode;
	
	private LanguageEnum(String localeCode, String upperLangCode,
			String lowerLangCode) {
		
		this.localeCode = localeCode;
		this.upperLangCode = upperLangCode;
		this.lowerLangCode = lowerLangCode;
	}

	public String getLocaleCode() {
		
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		
		this.localeCode = localeCode;
	}

	public String getUpperLangCode() {
		
		return upperLangCode;
	}

	public void setUpperLangCode(String upperLangCode) {
		
		this.upperLangCode = upperLangCode;
	}

	public String getLowerLangCode() {
		
		return lowerLangCode;
	}

	public void setLowerLangCode(String lowerLangCode) {
		
		this.lowerLangCode = lowerLangCode;
	}
}

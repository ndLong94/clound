package vn.com.fpt.boot.beans.models;

public class HelloWorldModel {
	
	private String hello;
	private String welcome;
	
	public HelloWorldModel() {
		
		super();
	}

	public HelloWorldModel(String hello, String welcome) {
		
		super();
		this.hello = hello;
		this.welcome = welcome;
	}

	public String getHello() {
		
		return hello;
	}
	
	public void setHello(String hello) {
		
		this.hello = hello;
	}
	
	public String getWelcome() {
		
		return welcome;
	}
	
	public void setWelcome(String welcome) {
		
		this.welcome = welcome;
	}
	
	
}

package com.overriding.website;

public class WebSite {
	
	String url;
	int ipAddress;
	
	public WebSite(String url, int ipAddress) {
		this.url = url;
		this.ipAddress = ipAddress;
	}
	void shop(){
		System.out.println("shopping");
	}
	void deliver(){
		System.out.println("deliver with the help of Indian Post");
	}
	
	

}

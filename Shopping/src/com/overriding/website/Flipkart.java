package com.overriding.website;

public class Flipkart extends WebSite {

	public Flipkart(String url, int ipAddress) {
		super(url, ipAddress);
		
	}
	void shopGiftCard(){
		System.out.println("shop using gift card");
	}
	

}

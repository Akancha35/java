package com.overriding.website;

public class Amazon extends WebSite {

	public Amazon(String url, int ipAddress) {
		super(url, ipAddress);

	}

	void deliver() {
		System.out.println("deliver with the help of amazon delivery");
	}

	void amazonPay() {
		System.out.println("make payment");
	}

}

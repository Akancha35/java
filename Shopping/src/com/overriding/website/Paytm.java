package com.overriding.website;

public class Paytm extends WebSite{

	public Paytm(String url, int ipAddress) {
		super(url, ipAddress);
		
	}
	void bookMovieTickets(){
		System.out.println("book a movie ticket");
	}

}

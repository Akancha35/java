package com.overriding.website;

public class Person {

	void shop() {
		Browser b = new Browser();
		WebSite w = b.choose();
		if (w != null) {
			w.shop();
			if (w instanceof Amazon) {
				Amazon a = (Amazon) w;
				a.amazonPay();
			} else if (w instanceof Flipkart) {
				Flipkart f = (Flipkart) w;
				f.shopGiftCard();
			} else if (w instanceof Paytm) {
				Paytm p1 = (Paytm) w;
				p1.bookMovieTickets();
			}
			w.deliver();
		}

	}

	public static void main(String[] args) {
		Person p = new Person();
		p.shop();

	}

}

package com.overriding.website;

import java.util.Scanner;

public class Browser {
	WebSite choose() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any website");
		String siteName = s.next();
		if (siteName.equalsIgnoreCase("amazon")) {
			return new Amazon("www.amazon.com", 133565);
		}

		else if (siteName.equalsIgnoreCase("Flipkart")) {
			return new Flipkart("www.flipkart.com", 5721455);
		}

		else if (siteName.equalsIgnoreCase("Paytm")) {
			return new Paytm("www.paytm.com", 254522555);
		} else
			return null;

	}
}

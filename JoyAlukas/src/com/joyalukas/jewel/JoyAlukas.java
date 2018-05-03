package com.joyalukas.jewel;

import java.util.Random;

public class JoyAlukas {

	Jewel luckyDip() {
		int opt = new Random().nextInt(12);
		switch (opt) {
		case 1:
			return new Ring();
		case 2:
			return new Chain();
		case 3:
			return new Bracelet();
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		JoyAlukas j = new JoyAlukas();
		Jewel j1 = j.luckyDip();
		System.out.println(j1);

	}

}

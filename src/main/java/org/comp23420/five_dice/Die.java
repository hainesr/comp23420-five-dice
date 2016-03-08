package org.comp23420.five_dice;

import java.util.Random;

public class Die {

	private static final Random random = new Random();

	public static int roll(final int sides) {
		return 1 + random.nextInt(sides);
	}

}

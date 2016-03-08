package org.comp23420.five_dice;

import java.util.ArrayList;
import java.util.List;

public class Dice {

	private final int sides;
	private final int number;

	public Dice(int sides, int number) {
		this.sides = sides;
		this.number = number;
	}

	public List<Integer> roll() {
		List<Integer> result = new ArrayList<Integer>(number);

		for(int i = 0; i < number; i++) {
			result.add(Die.roll(sides));
		}

		return result;
	}

}

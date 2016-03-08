package org.comp23420.five_dice;

import java.util.Collections;
import java.util.List;

public class Turn {

	private final List<Integer> roll;

	public Turn() {
		roll = new Dice(6, 5).roll();
		Collections.sort(roll);
	}

	public List<Integer> getRoll() {
		return roll;
	}

	public boolean isFiveOfAKind() {
		return roll.get(0) == roll.get(4);
	}

	public boolean isFourOfAKind() {
		return (roll.get(0) == roll.get(3) || roll.get(1) == roll.get(4));
	}

	public boolean isLargeStraight() {
		return (roll.get(0) + 4) == roll.get(4);
	}

	public boolean isOverTwenty() {
		int total = 0;

		for (int i : roll) {
			total += i;
		}

		return total > 20;
	}

}

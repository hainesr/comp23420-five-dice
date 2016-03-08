package org.comp23420.five_dice;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestDice {

	@Test
	public void testFiveDice() {
		Dice d = new Dice(6, 5);
		List<Integer> roll = d.roll();

		assertEquals(5, roll.size());
	}

}

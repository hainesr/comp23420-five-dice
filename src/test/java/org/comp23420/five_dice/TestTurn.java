package org.comp23420.five_dice;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestTurn {

	private Dice dice;

	@Before
	public void setup() {
		dice = new Dice(6, 5);
	}

	@Test
	public void testFiveOfAKind() {
		assertTrue(new Turn(dice).isFiveOfAKind());
	}

	@Test
	public void testFourOfAKind() {
		assertTrue(new Turn(dice).isFourOfAKind());
	}

	@Test
	public void testLargeStraight() {
		assertTrue(new Turn(dice).isLargeStraight());
	}

	@Test
	public void testOverTwenty() {
		assertTrue(new Turn(dice).isOverTwenty());
	}

}

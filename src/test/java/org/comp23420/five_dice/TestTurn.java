package org.comp23420.five_dice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTurn {

	@Test
	public void testFiveOfAKind() {
		assertTrue(new Turn().isFiveOfAKind());
	}

	@Test
	public void testFourOfAKind() {
		assertTrue(new Turn().isFourOfAKind());
	}

	@Test
	public void testLargeStraight() {
		assertTrue(new Turn().isLargeStraight());
	}

	@Test
	public void testOverTwenty() {
		assertTrue(new Turn().isOverTwenty());
	}

}

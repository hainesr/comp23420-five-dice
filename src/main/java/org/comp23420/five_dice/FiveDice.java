package org.comp23420.five_dice;

public class FiveDice {

	public static void main(String[] args) {
		Turn turn = new Turn();
		System.out.println(turn.getRoll());
		System.out.println();
		System.out.println("Five of a kind? " + turn.isFiveOfAKind());
		System.out.println("Four of a kind? " + turn.isFourOfAKind());
		System.out.println("Large straight? " + turn.isLargeStraight());
		System.out.println("Over twenty?    " + turn.isOverTwenty());
	}

}

package com.guessing.n.cheating;

import java.util.List;

public class Solution {

	static String guessncheating(List<Round> gameRounds) {
		int min = 0, max = 100, round = 0;
		for (Round gameRound : gameRounds) {
			int guessNumber = gameRound.getGuessNumber();
			if (gameRound.getLevel().equals(LevelEnum.TOO_LOW)) {
				if (min < guessNumber) {
					min = guessNumber;
				}
				round++;
			} else if (gameRound.getLevel().equals(LevelEnum.TOO_HIGH)) {
				if (max > guessNumber) {
					max = guessNumber;
				}
				round++;
			} else if (gameRound.getLevel().equals(LevelEnum.RIGHT_ON)) {
				if (guessNumber >= min && guessNumber <= max) {
					return MessagesUtil.NO_EVIDENCE;
				} else {
					round++;
					return MessagesUtil.ALICE_CHEATING_IN_ROUND + round;
				}
			}
			if (max <= min) {
				return MessagesUtil.ALICE_CHEATING_IN_ROUND + round;
			} else if (max - min == 1) {
				return MessagesUtil.ALICE_CHEATING_IN_ROUND + round;
			}
		}
		throw new IllegalArgumentException();
	}
}

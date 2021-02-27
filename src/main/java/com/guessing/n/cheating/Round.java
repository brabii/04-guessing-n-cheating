package com.guessing.n.cheating;

public class Round {
	private int guessNumber;
	private LevelEnum level;

	public Round(int guessNumber, LevelEnum level) {
		this.guessNumber = guessNumber;
		this.level = level;
	}

	public int getGuessNumber() {
		return guessNumber;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public LevelEnum getLevel() {
		return level;
	}

	public void setLevel(LevelEnum level) {
		this.level = level;
	}

}

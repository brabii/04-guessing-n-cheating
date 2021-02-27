package com.guessing.n.cheating;

public enum LevelEnum {
	TOO_LOW("too low"), TOO_HIGH("too high"), RIGHT_ON("right on");

	private String level;

	private LevelEnum(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
}

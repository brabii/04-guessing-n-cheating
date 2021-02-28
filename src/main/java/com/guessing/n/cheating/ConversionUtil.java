package com.guessing.n.cheating;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rabie
 *  puisque les inputs de puzzle sont des chaines de caractéres on
 *  a besoin de cette classe qui permet les convertir en des objets {@link} Round
 *
 */
public final class ConversionUtil {
	public static List<Round> convertFromListOfStringToListOfRounds(List<String> list) {
		List<Round> rounds = new ArrayList<>();
		for (String elem : list) {
			String a[] = elem.split(" ");
			int number = Integer.parseInt(a[0]);
			String desc = a[1] + " " + a[2];
			LevelEnum level = convertFromStringToLevelEnum(desc);
			Round gameRound = new Round(number, level);
			rounds.add(gameRound);
		}
		return rounds;
	}

	private static LevelEnum convertFromStringToLevelEnum(String levelString) {
		switch (levelString) {
		case "too low":
			return LevelEnum.TOO_LOW;
		case "too high":
			return LevelEnum.TOO_HIGH;
		case "right on":
			return LevelEnum.RIGHT_ON;
		default:
			throw new IllegalArgumentException("invalid level.");
		}
	}

	public static List<Round> convertFromDataFileToRoundObjects(String fileName) {
		File f = new File(fileName);
		List<Round> gameRounds = new ArrayList<>();
		List<String> list = new ArrayList<>();
		Scanner in = null;
		try {
			in = new Scanner(f);
			while (in.hasNext()) {
				String line = in.nextLine();
				list.add(line);
				gameRounds = convertFromListOfStringToListOfRounds(list);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

		return gameRounds;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(convertFromDataFileToRoundObjects("src/main/resources/sample-cheating"));
	}

	private ConversionUtil() {
	}
}

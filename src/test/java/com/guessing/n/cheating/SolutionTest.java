package com.guessing.n.cheating;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class SolutionTest {

	private static final List<Round> LIST_SAMPLE_CHEATING = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/sample-cheating");
	private static final List<Round> LIST_CHEAT_RIGHT_ON_THE_FACE = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/cheat-right-on-the-face");
	private static final List<Round> LSIT_BOB_IN_MESS = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/bob-inMess");

	private static final List<Round> LIST_CONTRADICTION = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/contradiction");
	private static final List<Round> LIST_GOOD_LUCK = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/good-luck");
	private static final List<Round> LIST_SEQUENCE = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/sequence");
	private static final List<Round> LIST_IMPOSSIBLE = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/impossible");
	private static final List<Round> LIST_REPETITION = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/repetition");
	private static final List<Round> LIST_ELIMINATION = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/elimination");
	private static final List<Round> LIST_RIGHT_ON_THE_END = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/right-on-the-end");
	private static final List<Round> LIST_WEIRD_REASONING = ConversionUtil
			.convertFromDataFileToRoundObjects("src/main/resources/weird-reasoning");

	@Test
	public void testSampleCheating() {
		int round = 2;
		assertTrue(Solution.guessncheating(LIST_SAMPLE_CHEATING).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testCheatRightOnTheFace() {
		int round = 2;
		assertTrue(Solution.guessncheating(LIST_CHEAT_RIGHT_ON_THE_FACE)
				.equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testBobInMess() {
		assertTrue(Solution.guessncheating(LSIT_BOB_IN_MESS).equals(MessagesUtil.NO_EVIDENCE));
	}

	@Test
	public void testContradiction() {
		int round = 3;
		assertTrue(Solution.guessncheating(LIST_CONTRADICTION).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testGoodLuck() {
		assertTrue(Solution.guessncheating(LIST_GOOD_LUCK).equals(MessagesUtil.NO_EVIDENCE));
	}

	@Test
	public void testSequence() {
		assertTrue(Solution.guessncheating(LIST_SEQUENCE).equals(MessagesUtil.NO_EVIDENCE));
	}

	@Test
	public void testImpossible() {
		int round = 1;
		assertTrue(Solution.guessncheating(LIST_IMPOSSIBLE).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testRepetition() {
		assertTrue(Solution.guessncheating(LIST_REPETITION).equals(MessagesUtil.NO_EVIDENCE));
	}

	@Test
	public void testElimination() {
		int round = 5;
		assertTrue(Solution.guessncheating(LIST_ELIMINATION).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testRightOnTheEnd() {
		int round = 7;
		assertTrue(Solution.guessncheating(LIST_RIGHT_ON_THE_END).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}

	@Test
	public void testWeirdReasoning() {
		int round = 3;
		assertTrue(Solution.guessncheating(LIST_WEIRD_REASONING).equals(MessagesUtil.ALICE_CHEATING_IN_ROUND + round));
	}
}

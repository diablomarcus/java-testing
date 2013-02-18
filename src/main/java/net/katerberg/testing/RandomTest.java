package net.katerberg.testing;

import java.util.Random;

public class RandomTest {

	public static Random random = new Random();

	public static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static char getRandomCharacter() {
		char upperCharacter = getRandomCharacter();
		return random.nextBoolean() ? upperCharacter : Character
				.toLowerCase(upperCharacter);
	}

	public static char getRandomUpperCharacter() {
		return alpha.charAt(random.nextInt(alpha.length()));
	}

	public static char getRandomLowerCharacter() {
		return Character.toLowerCase(getRandomCharacter());
	}

	public static String getRandomString(Integer length) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < length; i++) {
			result.append(getRandomCharacter());
		}
		return result.toString();
	}

	public static String getRandomString() {
		return getRandomString(random.nextInt(20) + 1);
	}
	
	public static int getRandomNumber() {
		return random.nextInt();
	}
}

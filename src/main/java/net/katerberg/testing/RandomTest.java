package net.katerberg.testing;

import java.util.Random;

public class RandomTest {

	public static Random random = new Random();
	
	public static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static char getRandomCharacter() {
		Character character = alpha.charAt(random.nextInt(alpha.length()));
		
		return random.nextBoolean() ? character : Character.toLowerCase(character);
	}
	
	public static String getRandomString(Integer length) {
		StringBuilder result = new StringBuilder();
		for (int i=0; i<length; i++){
			result.append(getRandomCharacter());
		}
		return result.toString();
	}
	
	public static String getRandomString() {
		return getRandomString(random.nextInt(20)+1);
	}
}

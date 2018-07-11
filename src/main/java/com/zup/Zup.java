package com.zup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Zup {

	public static void main(String[] args) {

		System.out.println("===================================================");
		String password = generatePassword(6, 8);
		System.out.println("Password: " + password);
		System.out.println("===================================================");
	}

	static String generatePassword(int min_length, int max_length) {
		Random random = new Random();

		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChars = "!@#$%^&*(){}?";

		String allChars = upper + lower + numbers + specialChars;

		List<Character> letters = new ArrayList<Character>();
		for (char c : allChars.toCharArray())
			letters.add(c);

		// Inbuilt method to randomly shuffle a elements of a list
		Collections.shuffle(letters);
		String password = "";

		// Note that size of the password is also random
		for (int i = random.nextInt(max_length - min_length) + min_length; i > 0; --i) {
			password += letters.get(random.nextInt(letters.size()));
		}

		return password;
	}
}

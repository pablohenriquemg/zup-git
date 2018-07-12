package com.zup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zup {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		System.out.println("===================================================");
		// add new persons here
		persons.add(new Person(1, "Pablo", 19, generatePassword("Pablo")));
		persons.add(new Person(2, "Jose", 20, generatePassword("Jose")));
		persons.add(new Person(3, "Maria", 23, generatePassword("Maria")));

		// print all persons
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		System.out.println("===================================================");
	}

	static String generatePassword(String myName) {

		List<Character> letters = new ArrayList<Character>();
		for (char c : myName.toCharArray()) {
			letters.add(c);
		}

		Collections.shuffle(letters);
		String password = "";

		for (char character : letters) {
			password += character;
		}

		return password;
	}
}

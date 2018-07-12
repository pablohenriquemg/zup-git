package com.zup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zup {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		System.out.println("===================================================");
		// add new persons here
		persons.add(new Person(1, "Pablo", 19, generatePassword("Pablo")));
		persons.add(new Person(2, "Jose", 20, generatePassword("Jose")));
		persons.add(new Person(3, "Maria", 23, generatePassword("Maria")));
		persons.add(new Person(4, "Alfredo", 18, generatePassword("Alfredo")));
		persons.add(new Person(6, "Hernane", 60, generatePassword("Hernane")));
		persons.add(new Person(6, "Carlinhao", 22, generatePassword("Carlinhao")));
		persons.add(new Person(5, "Rivs", 31, generatePassword("Rivs")));
		persons.add(new Person(8, "Pedro", 32, generatePassword("Pedrovs")));

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

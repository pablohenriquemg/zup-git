package com.zup;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ZupTest {

	@Test
	public void shouldBeNotNull() {
		String password = Zup.generatePassword(6, 8);
		assertNotNull(password);
	}

}

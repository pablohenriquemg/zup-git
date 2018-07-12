package com.zup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ZupTest {

	@Test
	public void shouldBeNotNull() {
		String password = Zup.generatePassword("test");
		int length = password.length();
		assertEquals(4, length);
		assertNotNull(password);
	}

}

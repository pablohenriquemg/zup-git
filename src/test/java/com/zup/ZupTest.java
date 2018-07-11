package com.zup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ZupTest {

	@Test
	public void shouldBeNotNull() {
		String password = Zup.generatePassword("test");
		int index = password.indexOf("e");
		assertEquals(0, index);
		assertNotNull(password);
	}

}

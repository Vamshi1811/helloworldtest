package org.jacoco.examples.java.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class helloworldtest {

	private helloworld subject;

	@Before
	public void setup() {
		subject = new helloworld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello, World!", subject.getMessage(false));
	}
	
}

package com.itv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	@Before
	public void before() {
		System.out.println("Testing");
	}
	
	@Test
	public void testAdd2() {
		Calculator cal = new Calculator();
		int res = cal.add(4, 2);
		assertEquals(6, res);
	}

	@Test
	public void checkHelloNull() {
		Calculator cal = new Calculator();
		assertNull(cal.hello());
	}
	
	@Test
	public void checkBoolean() {
		Calculator cal = new Calculator();
		assertTrue(cal.isAvailable());
	}
	
}

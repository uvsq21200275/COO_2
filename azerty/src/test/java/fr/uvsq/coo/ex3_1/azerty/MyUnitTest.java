package fr.uvsq.coo.ex3_1.azerty;

/**
 * 
 * @author Thomas Estrabaud
 * 
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}
}
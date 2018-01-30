package adder;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {
	
	Adder adder = new Adder();

	@Test
	public void testAdder1() {
		assertEquals(12, adder.adder(3, 5));
	}

	@Test
	public void testAdder2() {
		assertEquals(6, adder.adder(-5, 6));
	}

	@Test
	public void testAdder3() {
		assertEquals(6, adder.adder(6, -5));
	}

	@Test
	public void testAdder4() {
		assertEquals(-21, adder.adder(-6, -1));
	}

}

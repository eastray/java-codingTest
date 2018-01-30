package functionalTestCode;

import static org.junit.Assert.*;

import org.junit.Test;

import lineCombination.LineCombination;

public class CombinationTest {

	LineCombination lc = new LineCombination();

	@Test
	public void testFactorial() {
		
		assertEquals(6, lc.factorial(3));
		assertEquals(24, lc.factorial(4));
	}

}

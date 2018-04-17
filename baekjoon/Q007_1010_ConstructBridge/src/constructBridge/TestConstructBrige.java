package constructBridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructBrige {

	@Test
	public void testConstructBridge() {
		ConstructBridge cb = new ConstructBridge();
		
		assertEquals(1, cb.constructBridge(2, 2));
		assertEquals(5, cb.constructBridge(1, 5));
		assertEquals(5, cb.constructBridge(13, 29));
		
	}

}

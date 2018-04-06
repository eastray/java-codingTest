package distributedComputing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDistributedComputing {

	DistributedComputing dc = new DistributedComputing();

	@Test
	public void testDistributed() {
		assertEquals(1, dc.distributed(1, 6));
		assertEquals(7, dc.distributed(3, 7));
		assertEquals(6, dc.distributed(6, 2));
		assertEquals(1, dc.distributed(7, 100));
		assertEquals(9, dc.distributed(9, 635));
	}

}

package deliverySugar;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeliverySugarTest {
	
	@Test
	public void testCountOfDeliverySugar2(){
		DeliverySugar ds = new DeliverySugar();
		
		assertEquals(-1, ds.countOfDeliverySugar(1));
		assertEquals(-1, ds.countOfDeliverySugar(2));
		assertEquals(1, ds.countOfDeliverySugar(3));
		assertEquals(-1, ds.countOfDeliverySugar(4));
		assertEquals(1, ds.countOfDeliverySugar(5));
		assertEquals(2, ds.countOfDeliverySugar(6));
		assertEquals(-1, ds.countOfDeliverySugar(7));
		assertEquals(2, ds.countOfDeliverySugar(8));
		assertEquals(3, ds.countOfDeliverySugar(9));
		assertEquals(2, ds.countOfDeliverySugar(10));
	}

	@Test
	public void testCountOfDeliverySugar() {
		DeliverySugar ds = new DeliverySugar();
		
		assertEquals(4, ds.countOfDeliverySugar(18));
		assertEquals(-1, ds.countOfDeliverySugar(4));
		assertEquals(2, ds.countOfDeliverySugar(6));
		assertEquals(3, ds.countOfDeliverySugar(9));
		assertEquals(3, ds.countOfDeliverySugar(11));
		assertEquals(4, ds.countOfDeliverySugar(12));
		assertEquals(3, ds.countOfDeliverySugar(15));
		assertEquals(4, ds.countOfDeliverySugar(16));
		assertEquals(6, ds.countOfDeliverySugar(24));
		assertEquals(6, ds.countOfDeliverySugar(30));
		assertEquals(623, ds.countOfDeliverySugar(3111));
		assertEquals(890, ds.countOfDeliverySugar(4444));
		assertEquals(1001, ds.countOfDeliverySugar(4999));
		assertEquals(1000, ds.countOfDeliverySugar(5000));
		
		
	}

}

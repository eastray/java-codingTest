package currencyInterpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurrencyInterpreterTest {
	CurrencyInterpreter ci = new CurrencyInterpreter();

	@Test
	public void testCurrencyInterpreter() {
		assertEquals(new Long(9), ci.currencyInterpreter("구"));
		assertEquals(new Long(1000), ci.currencyInterpreter("천"));
		assertEquals(new Long(9000), ci.currencyInterpreter("구천"));
		assertEquals(new Long(99), ci.currencyInterpreter("구십구"));
		assertEquals(new Long(9009), ci.currencyInterpreter("구천구"));
		assertEquals(new Long(90009), ci.currencyInterpreter("구만구"));
		assertEquals(new Long(100000), ci.currencyInterpreter("십만"));
		assertEquals(new Long(100000), ci.currencyInterpreter("일십만"));
		assertEquals(new Long(1000000), ci.currencyInterpreter("일백만"));
		assertEquals(new Long(10000000), ci.currencyInterpreter("일천만"));
		assertEquals(new Long(100000000), ci.currencyInterpreter("일만만"));
		assertEquals(new Long(500000000), ci.currencyInterpreter("오억"));
		assertEquals(new Long(100000000), ci.currencyInterpreter("일억"));
		assertEquals(new Long(50000000), ci.currencyInterpreter("오천만"));
		assertEquals(new Long(150000000), ci.currencyInterpreter("일억오천만"));
		assertEquals(new Long(Long.parseLong("4097000020000316")), ci.currencyInterpreter("사천구십칠조이천만삼백십육"));

	}

}

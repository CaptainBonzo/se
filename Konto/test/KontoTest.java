import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KontoTest {
	Konto konto;
	int startGuthaben = 500;
	
	@Before
	public void initialize(){
		konto = new Konto(startGuthaben);
	}
	@Test
	public void testStartGuthaben(){
		assertEquals(startGuthaben, konto.getGuthaben());
	}
	@Test
	public void mehrmaligesEinzahlen(){
		konto.einzahlen(50);
		konto.einzahlen(100);
		konto.einzahlen(1000);
		int expected = startGuthaben+50+100+1000;
		
		assertEquals(expected, konto.getGuthaben());
	}
	@Test (expected=Exception.class)
	public void versuchtesUeberziehen() throws Exception{
		konto.einzahlen(50);
		konto.auszahlen(51+startGuthaben);
	}
	@Test
	public void auszahlen() throws Exception{
		konto.einzahlen(100);
		konto.auszahlen(50);
		int expected = startGuthaben + 100 - 50;
		assertEquals(expected, konto.getGuthaben());
	}
	@Test
	public void mehrmaligesEinzahlenAllesAuszahlen() throws Exception{
		konto.einzahlen(100);
		konto.einzahlen(70);
		int betrag = startGuthaben + 100 + 70;
		konto.auszahlen(betrag);
		assertEquals(0, konto.getGuthaben());
	}
}

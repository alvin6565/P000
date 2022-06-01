import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		//fail("Not yet implemented");
	}

	public void testAdd() {
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
	
		int actual = cal.add (a, b);
	
		int expected = 5555;
		assertEquals(expected,actual);
				
}
	@Test
	public void testSub() {
		int a = 9;
		int b = 5;
		Calculator cal = new Calculator();
	
		int actual = cal.sub(a, b);
	
		int expected = 4;
		assertEquals(expected,actual);
}
	@Test
	public void testMul() {
		int a = 9;
		int b = 5;
		Calculator cal = new Calculator();
	
		int actual = cal.mul(a, b);
	
		int expected = 45;
		assertEquals(expected,actual);
}
}

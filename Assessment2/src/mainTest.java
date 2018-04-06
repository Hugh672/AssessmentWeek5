import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {

	@Test
	public void testAdd() {
		assertEquals(2, main.add(1, 1));
		//fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		assertEquals(2, main.subtract(3, 1));
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		assertEquals(2.0, main.divide(4, 2), 0.0f);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		assertEquals(8.0, main.multiply(4, 2), 0.0f);
		//fail("Not yet implemented");
	}

}

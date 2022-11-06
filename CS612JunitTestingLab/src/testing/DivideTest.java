package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double divide = test.divide(40, 5);
		assertEquals(8,divide);
	}
	
	@Test
	void test1() {
		JunitTesting test1 = new JunitTesting();
		double divide = test1.divide(50, 5);
		assertEquals(10,divide);
	}

}

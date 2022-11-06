package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int count = test.count("Alexa");
		assertEquals(2,count);
		
	}

}

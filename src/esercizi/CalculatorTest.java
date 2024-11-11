package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
	}

	@Test
	void testSum() {
		assertEquals(12, calculator.sum(10, 2));
	}
	
	@Test
	void testSub() {
		assertEquals(8, calculator.sub(10, 2));
	}
	
	@Test
	void testMult() {
		assertEquals(20, calculator.mult(10, 2));
	}
	
	@Test
	void testDiv() {
		assertEquals(5, calculator.div(10, 2));
	}
	
	@Test
	void testMod() {
		assertEquals(0, calculator.mod(10, 2));
	}

}

package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;

	@BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3), "La somma di 2 e 3 dovrebbe essere 5");
        assertEquals(0, calculator.sum(-2, 2), "La somma di -2 e 2 dovrebbe essere 0");
        assertEquals(-10, calculator.sum(-5, -5), "La somma di -5 e -5 dovrebbe essere -10");
    }

    @Test
    public void testSub() {
        assertEquals(-1, calculator.sub(2, 3), "La sottrazione di 2 e 3 dovrebbe essere -1");
        assertEquals(-4, calculator.sub(-2, 2), "La sottrazione di -2 e 2 dovrebbe essere -4");
        assertEquals(0, calculator.sub(-5, -5), "La sottrazione di -5 e -5 dovrebbe essere 0");
    }

    @Test
    public void testMult() {
        assertEquals(6, calculator.mult(2, 3), "La moltiplicazione di 2 e 3 dovrebbe essere 6");
        assertEquals(-4, calculator.mult(-2, 2), "La moltiplicazione di -2 e 2 dovrebbe essere -4");
        assertEquals(25, calculator.mult(-5, -5), "La moltiplicazione di -5 e -5 dovrebbe essere 25");
    }

    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(6, 3), "La divisione di 6 e 3 dovrebbe essere 2");
        assertEquals(-2, calculator.div(-6, 3), "La divisione di -6 e 3 dovrebbe essere -2");
        assertEquals(1, calculator.div(-5, -5), "La divisione di -5 e -5 dovrebbe essere 1");
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0), "La divisione per zero dovrebbe lanciare ArithmeticException");
    }

    @Test
    public void testMod() {
        assertEquals(1, calculator.mod(7, 3), "Il resto di 7 e 3 dovrebbe essere 1");
        assertEquals(-1, calculator.mod(-7, 3), "Il resto di -7 e 3 dovrebbe essere -1");
        assertEquals(0, calculator.mod(6, 3), "Il resto di 6 e 3 dovrebbe essere 0");
        assertThrows(ArithmeticException.class, () -> calculator.mod(5, 0), "Il modulo con zero dovrebbe lanciare ArithmeticException");
    }

}

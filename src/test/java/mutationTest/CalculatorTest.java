package mutationTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.seidoropentrends.classes.Calculator;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(0, calc.suma(-2, 2));
       
    }

    
}
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

    @Test
    public void testResta() {
        assertEquals(3, calc.resta(5, 2));
    }

    @Test
    public void testRestaNegativa(){
        assertEquals(-14, calc.resta(-10, 4));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(28, calc.multiplica(4, 7));
    }

    @Test
    public void testDivision() {
        assertEquals(5, calc.divideix(10,2));
    }
    @Test
    public void testDivisionException() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.divideix(10, 0));
    }

    @Test
    public void testMaxim(){
        assertEquals(7, calc.maxim(5,7));
    }

    @Test
    public void testArrel(){
        assertEquals(5, calc.arrelQuadrada(25), 0.001);
    }

    @Test
    public void testArrelException() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.arrelQuadrada(-1));
    }

    @Test
    public void testEsPositiu_numPositivo(){
        assertTrue(calc.esPositiu(4));
    }

    @Test
    public void testEsPositiu_numNegativo(){
        assertFalse(calc.esPositiu(-4));
    }
    @Test
    public void testPotencia_exponentZero(){
        assertEquals(1,calc.potencia(5,0));
    }
    @Test
    public void testPotencia_exponentPositiu(){
        assertEquals(78125.0,calc.potencia(5,7), 0.001);
    }

    @Test
    public void testPotencia_exponentNegativo(){
        assertThrows(IllegalArgumentException.class,
                () -> calc.potencia(5,-1));
    }
}
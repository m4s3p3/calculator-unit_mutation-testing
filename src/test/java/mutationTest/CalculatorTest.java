package mutationTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.seidoropentrends.classes.Calculator;

@DisplayName("Tests de la classe Calculator")
public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    // ==================== TESTS DE SUMA ====================
    @Test
    @DisplayName("Suma: valors positius")
    public void testSuma_valorsPositius() {
        // Arrange + Act + Assert
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    @DisplayName("Suma: valors negatius i positius")
    public void testSuma_negativiPositiu() {
        assertEquals(0, calc.suma(-2, 2));
    }

    @Test
    @DisplayName("Suma: ambdós valors negatius")
    public void testSuma_ambdosNegatius() {
        assertEquals(-7, calc.suma(-3, -4));
    }

    @Test
    @DisplayName("Suma: amb zero")
    public void testSuma_ambZero() {
        assertEquals(5, calc.suma(5, 0));
        assertEquals(0, calc.suma(0, 0));
    }

    // ==================== TESTS DE RESTA ====================
    @Test
    @DisplayName("Resta: valors positius")
    public void testResta() {
        assertEquals(3, calc.resta(5, 2));
    }

    @Test
    @DisplayName("Resta: resultat negatiu")
    public void testResta_resultatNegatiu() {
        assertEquals(-14, calc.resta(-10, 4));
    }

    @Test
    @DisplayName("Resta: amb zero")
    public void testResta_ambZero() {
        assertEquals(5, calc.resta(5, 0));
        assertEquals(-5, calc.resta(0, 5));
    }

    // ==================== TESTS DE MULTIPLICACIÓ ====================
    @Test
    @DisplayName("Multiplicació: valors positius")
    public void testMultiplicacio() {
        assertEquals(28, calc.multiplica(4, 7));
    }

    @Test
    @DisplayName("Multiplicació: amb zero")
    public void testMultiplicacio_ambZero() {
        assertEquals(0, calc.multiplica(5, 0));
        assertEquals(0, calc.multiplica(0, 5));
    }

    @Test
    @DisplayName("Multiplicació: amb negatiu")
    public void testMultiplicacio_ambNegatiu() {
        assertEquals(-20, calc.multiplica(4, -5));
        assertEquals(20, calc.multiplica(-4, -5));
    }

    // ==================== TESTS DE DIVISIÓ ====================
    @Test
    @DisplayName("Divisió: divisió exacta")
    public void testDivisio_exacta() {
        assertEquals(5, calc.divideix(10, 2));
    }

    @Test
    @DisplayName("Divisió: divisió amb truncament")
    public void testDivisio_ambTruncament() {
        assertEquals(3, calc.divideix(7, 2));
    }

    @Test
    @DisplayName("Divisió: excepció per divisor zero")
    public void testDivisio_excepcio() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calc.divideix(10, 0)
        );
        assertEquals("No es pot dividir per zero", exception.getMessage());
    }

    @Test
    @DisplayName("Divisió: amb nombres negatius")
    public void testDivisio_ambNegatius() {
        assertEquals(-5, calc.divideix(-10, 2));
        assertEquals(-5, calc.divideix(10, -2));
        assertEquals(5, calc.divideix(-10, -2));
    }

    // ==================== TESTS DE MÀXIM ====================
    @Test
    @DisplayName("Màxim: primer és més gran")
    public void testMaxim_primerMesGran() {
        assertEquals(7, calc.maxim(7, 5));
    }

    @Test
    @DisplayName("Màxim: segon és més gran")
    public void testMaxim_segonMesGran() {
        assertEquals(7, calc.maxim(5, 7));
    }

    @Test
    @DisplayName("Màxim: valors iguals")
    public void testMaxim_iguals() {
        assertEquals(5, calc.maxim(5, 5));
    }

    @Test
    @DisplayName("Màxim: amb negatius")
    public void testMaxim_ambNegatius() {
        assertEquals(5, calc.maxim(-3, 5));
        assertEquals(-3, calc.maxim(-10, -3));
    }

    // ==================== TESTS D'ARREL QUADRADA ====================
    @Test
    @DisplayName("Arrel quadrada: valor positiu")
    public void testArrel_valorPositiu() {
        assertEquals(5.0, calc.arrelQuadrada(25), 0.001);
    }

    @Test
    @DisplayName("Arrel quadrada: de zero")
    public void testArrel_deZero() {
        assertEquals(0.0, calc.arrelQuadrada(0), 0.001);
    }

    @Test
    @DisplayName("Arrel quadrada: excepció per negatiu")
    public void testArrel_excepcio() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calc.arrelQuadrada(-1)
        );
        assertEquals("No es pot calcular arrel quadrada de negatius", exception.getMessage());
    }

    @Test
    @DisplayName("Arrel quadrada: decimal")
    public void testArrel_decimal() {
        assertEquals(1.414, calc.arrelQuadrada(2), 0.001);
    }

    // ==================== TESTS DE ESPOSITU ====================
    @Test
    @DisplayName("És positiu: nombre positiu")
    public void testEsPositiu_positiu() {
        assertTrue(calc.esPositiu(4));
    }

    @Test
    @DisplayName("És positiu: nombre negatiu")
    public void testEsPositiu_negatiu() {
        assertFalse(calc.esPositiu(-4));
    }

    @Test
    @DisplayName("És positiu: zero")
    public void testEsPositiu_zero() {
        assertFalse(calc.esPositiu(0));
    }

    // ==================== TESTS DE POTÈNCIA ====================
    @Test
    @DisplayName("Potència: exponent zero")
    public void testPotencia_exponentZero() {
        assertEquals(1, calc.potencia(5, 0));
        assertEquals(1, calc.potencia(0, 0)); // cas especial 0^0
    }

    @Test
    @DisplayName("Potència: exponent positiu")
    public void testPotencia_exponentPositiu() {
        assertEquals(8, calc.potencia(2, 3));
        assertEquals(78125, calc.potencia(5, 7));
    }

    @Test
    @DisplayName("Potència: base zero")
    public void testPotencia_baseZero() {
        assertEquals(0, calc.potencia(0, 5));
    }

    @Test
    @DisplayName("Potència: base negativa")
    public void testPotencia_baseNegativa() {
        assertEquals(-8, calc.potencia(-2, 3));
        assertEquals(16, calc.potencia(-2, 4));
    }

    @Test
    @DisplayName("Potència: excepció per exponent negatiu")
    public void testPotencia_excepcioExponentNegatiu() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calc.potencia(5, -1)
        );
        assertEquals("Exponent ha de ser positiu", exception.getMessage());
    }
}
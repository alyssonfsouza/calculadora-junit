import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    // --- Testes de Adição ---
    @Test
    void testSomarPositivos() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(10, calc.somar(7, 3));
    }

    @Test
    void testSomarNegativos() {
        assertEquals(-5, calc.somar(-2, -3));
        assertEquals(-1, calc.somar(2, -3)); // Positivo com Negativo
        assertEquals(1, calc.somar(-2, 3)); // Negativo com Positivo
    }

    @Test
    void testSomarComZero() {
        assertEquals(3, calc.somar(3, 0));
        assertEquals(-3, calc.somar(-3, 0));
        assertEquals(0, calc.somar(0, 0));
    }

    // --- Testes de Subtração ---
    @Test
    void testSubtrairPositivos() {
        assertEquals(1, calc.subtrair(4, 3));
        assertEquals(-1, calc.subtrair(3, 4));
    }

    @Test
    void testSubtrairNegativos() {
        assertEquals(-1, calc.subtrair(-4, -3)); // -4 - (-3) = -4 + 3 = -1
        assertEquals(7, calc.subtrair(4, -3));  // 4 - (-3) = 4 + 3 = 7
        assertEquals(-7, calc.subtrair(-4, 3)); // -4 - 3 = -7
    }

    @Test
    void testSubtrairComZero() {
        assertEquals(5, calc.subtrair(5, 0));
        assertEquals(-5, calc.subtrair(-5, 0));
        assertEquals(0, calc.subtrair(0, 0));
    }

    // --- Testes de Multiplicação ---
    @Test
    void testMultiplicarPositivos() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(20, calc.multiplicar(4, 5));
    }

    @Test
    void testMultiplicarNegativos() {
        assertEquals(6, calc.multiplicar(-2, -3));   // Negativo * Negativo = Positivo
        assertEquals(-6, calc.multiplicar(2, -3));   // Positivo * Negativo = Negativo
        assertEquals(-6, calc.multiplicar(-2, 3));   // Negativo * Positivo = Negativo
    }

    @Test
    void testMultiplicarPorZero() {
        assertEquals(0, calc.multiplicar(5, 0));
        assertEquals(0, calc.multiplicar(-5, 0));
        assertEquals(0, calc.multiplicar(0, 0));
    }

    // --- Testes de Divisão ---
    @Test
    void testDividirPositivos() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void testDividirNegativos() {
        assertEquals(2, calc.dividir(-6, -3));   // Negativo / Negativo = Positivo
        assertEquals(-2, calc.dividir(6, -3));   // Positivo / Negativo = Negativo
        assertEquals(-2, calc.dividir(-6, 3));   // Negativo / Positivo = Negativo
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
        assertThrows(ArithmeticException.class, () -> calc.dividir(-5, 0));
    }
}
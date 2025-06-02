import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(4, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}

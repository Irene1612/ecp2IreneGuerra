package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraccion;

    @Before
    public void before() {
        fraccion = new Fraction(2, 3);
    }
    @Test
    public void testFractionIntInt() {
        assertEquals(2, this.fraccion.getNumerator());
        assertEquals(3, this.fraccion.getDenominator());
    }

    @Test
    public void testFraction() {
        this.fraccion = new Fraction();
        assertEquals(1, this.fraccion.getNumerator());
        assertEquals(1, this.fraccion.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.6666, this.fraccion.decimal(), 10e-5);
    }

}

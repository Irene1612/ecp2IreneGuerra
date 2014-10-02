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
    
    @Test
    public void testFractionInverse() {
        Fraction fraccionInversa = new Fraction(3, 2);
        assertEquals(fraccionInversa.getNumerator(), this.fraccion.fractionInverse().getNumerator());
        assertEquals(fraccionInversa.getDenominator(), this.fraccion.fractionInverse().getDenominator());
    }
    
    @Test
    public void testEquivalentFraction() {
        Fraction fraccionEquivalente = new Fraction(6, 9);
        assertEquals(true, this.fraccion.isEquivalentFraction(fraccionEquivalente));
    }
    
    @Test
    public void testFractionDivision() {
        Fraction fraccion2 = new Fraction(4, 5);
        Fraction resultado = new Fraction(10, 12);
        assertEquals(resultado.getNumerator(), this.fraccion.fractionDivision(fraccion2).getNumerator());
        assertEquals(resultado.getDenominator(), this.fraccion.fractionDivision(fraccion2).getDenominator());
    }

}

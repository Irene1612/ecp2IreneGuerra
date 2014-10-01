package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection coleccion;

    @Before
    public void before() {
        this.coleccion = new DecimalCollection();
        this.coleccion.add(0.0);
        this.coleccion.add(2.1);
        this.coleccion.add(1.8);
    }

    @Test
    public void testDecimalCollection() {
        this.coleccion = new DecimalCollection();
        assertEquals(0, this.coleccion.size());
    }

    @Test
    public void testAdd() {
        this.coleccion = new DecimalCollection();
        this.coleccion.add(1.1);
        assertEquals(1.1, this.coleccion.sum(), 10e-3);
    }

    @Test
    public void testSize() {
        assertEquals(3, this.coleccion.size());
    }

    @Test
    public void testSum() {
        assertEquals(3.9, this.coleccion.sum(), 10e-3);
    }

    @Test
    public void testHigher() {
        assertEquals(2.1, this.coleccion.higher(), 10e-3);
    }

}

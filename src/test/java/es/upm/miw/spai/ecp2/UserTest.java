package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User usuario;

    @Before
    public void before() {
        this.usuario = new User(16, "Irene", "Sanchez");
    }

    @Test
    public void testUser() {
        assertEquals(16, this.usuario.getNumber());
        assertEquals("Irene", this.usuario.getName());
        assertEquals("Sanchez", this.usuario.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Irene Sanchez", this.usuario.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("I.", this.usuario.initials());
    }
    
    @Test
    public void testFamilyNameCommaName() {
        assertEquals("Sanchez, Irene", this.usuario.familyNameCommaName());
    }

}

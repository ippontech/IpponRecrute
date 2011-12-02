package fr.ippon.rh.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Teste la classe Etape4Service.
 */
public class Etape4ServiceTest {

    @Test
    public void testGetOffre() {
        Etape4Service etape4Service = new Etape4Service();
        assertTrue(etape4Service.decriptText().contains("Ippon"));
    }
}

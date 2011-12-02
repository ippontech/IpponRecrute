package fr.ippon.rh.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Teste la classe Etape2Service.
 */
public class Etape2ServiceTest {

    @Test
    public void testGetOffre() {
        Etape2Service etape2Service = new Etape2Service();
        assertTrue(etape2Service.decriptText().contains("Ippon"));
    }
}

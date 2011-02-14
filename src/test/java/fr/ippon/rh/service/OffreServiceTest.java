package fr.ippon.rh.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Teste la classe OffreService.
 */
public class OffreServiceTest {

    @Test
    public void testGetOffre() {
        OffreService offreService = new OffreService();
        //L'offre d'emploi contient le mot clef Ippon
        assertTrue(offreService.getOffre().contains("Ippon"));
    }
}

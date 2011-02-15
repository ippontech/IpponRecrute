package fr.ippon.rh.web;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.ExtendedModelMap;

import fr.ippon.rh.service.OffreService;

/**
 * Test de la classe {@link IpponController}
 */
public class IpponControllerTest {

    private IpponController controller;
    private OffreService mockOffreService;

    @Before
    public void setUp() {
        mockOffreService = mock(OffreService.class);
        controller = new IpponController(mockOffreService);
    }

    @Test
    public void testIpponRecruteGet() {
        // Expect
        ExtendedModelMap model = new ExtendedModelMap();
        String text = "Offre";
        when(mockOffreService.getOffre()).thenReturn(text);

        // When
        String returnViewName = controller.ipponRecrute(model);

        // Verify
        verify(mockOffreService, times(1)).getOffre();
        assertThat(returnViewName).isNotNull();
        assertThat(returnViewName).isEqualTo("ippon");
        assertThat(model).isNotNull();
        assertThat(model).hasSize(1);
        assertThat(model.get("offre")).isNotNull();
        assertThat(model.get("offre")).isEqualTo(text);
    }
}

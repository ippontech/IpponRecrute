package fr.ippon.rh.web;

import fr.ippon.rh.service.OffreService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ExtendedModelMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.easymock.EasyMock.*;

/**
 * Test de la classe {@link IpponController}
 */
public class IpponControllerTest {

    private IpponController controller;
    private OffreService mockOffreService;

    @Before
    public void setUp(){
        //Init
        controller = new IpponController();
        mockOffreService = createMock(OffreService.class);
        ReflectionTestUtils.setField(controller, "offreService", mockOffreService);
    }

    @Test
    public void testIpponRecruteGet(){
        //Expect
        ExtendedModelMap model = new ExtendedModelMap();
        String text = "Offre";
        expect(mockOffreService.getOffre()).andReturn(text);

        // When
        replay(mockOffreService);
        String returnViewName = controller.ipponRecrute(model);

        // Verify
        verify(mockOffreService);
        assertNotNull(returnViewName);
        assertEquals("ippon", returnViewName);
        assertEquals(1, model.size());
        assertNotNull(model.get("offre"));
        assertEquals(text, model.get("offre"));
    }
}

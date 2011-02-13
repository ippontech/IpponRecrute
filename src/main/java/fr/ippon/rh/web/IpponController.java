package fr.ippon.rh.web;

import fr.ippon.rh.service.OffreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Page Web d'offre d'emploi.
 */
@Controller
public class IpponController {

    @Inject
    private OffreService offreService;

    /**
     * Affiche l'offre.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView ipponRecrute() {
        ModelAndView mv = new ModelAndView("ippon");
        mv.addObject("offre", offreService.getOffre());
        return mv;
    }

}


package fr.ippon.rh.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ippon.rh.service.OffreService;

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
    public String ipponRecrute(Model model) {
        model.addAttribute("offre", offreService.getOffre());
        return "ippon";
    }
}


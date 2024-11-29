package sg.edu.nus.iss.ssf_17l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.ssf_17l.model.Carpark;
import sg.edu.nus.iss.ssf_17l.restapi.controller.CarparkAPIController;


@Controller
@RequestMapping("/carpark-rates")
public class CarparkController {
    @Autowired
    private CarparkAPIController carparkAPIController;

    @GetMapping("/all")
    public String allCarparks(Model model) {
        List<Carpark> carparks = carparkAPIController.getAll();
        model.addAttribute("carparks", carparks);
        return "carparks";
    }
    
}

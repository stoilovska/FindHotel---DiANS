package mk.ukim.finki.findhotel.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage(@RequestParam(required = false) String error, Model model) {
        String s = "pozadina.jpg";
        model.addAttribute("pozadina",s);
        return "home";
    }


}
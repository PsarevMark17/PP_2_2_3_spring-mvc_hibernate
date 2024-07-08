package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;

@Controller
public class MainController {
    @GetMapping("/")
    public String users(Model model) {
        return "/";
    }
}

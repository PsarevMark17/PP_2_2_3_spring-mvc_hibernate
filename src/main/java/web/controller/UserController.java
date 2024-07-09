package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String users(Model model) {
        model.addAttribute("users", userService.readAll());
        model.addAttribute("newUser", new User());
        return "users/table";
    }

    @PostMapping
    public String create(@ModelAttribute("newUser") User newUser) {
        userService.create(newUser);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("deleteId") Long deleteId) {
        userService.delete(deleteId);
        return "redirect:/users";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", userService.read(id));
        return "users/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("user") User user, @RequestParam("id") Long id) {
        user.setId(id);
        userService.update(user);
        return "redirect:/users";
    }
}

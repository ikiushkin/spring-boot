package ru.ivk.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ivk.springboot.model.User;
import ru.ivk.springboot.services.UserService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        LocalDateTime date = LocalDateTime.now();
        model.addAttribute("user", new User(1L, "Igor", "KI", date));

        return "index";
    }

    @GetMapping("/userList*")
    public String getUsers(Model model) {
        List<User> result = userService.getUsers();
        model.addAttribute("users", result);

        return "userList";
    }
}

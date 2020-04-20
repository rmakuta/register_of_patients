package pl.makuta.register_of_patients.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/all")
    public String showUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "user_all";
    }

    @GetMapping("/user/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user_add";
    }

    @PostMapping("/user/add")
    public String addUser(@ModelAttribute User user){
        userService.add(user);
        return "redirect:all";
    }

    @RequestMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.delete(userService.findById(id));
        return "redirect:/home/user/all";
    }

    @GetMapping("/user/edit/{id}")
    public String editUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.findById(id));
        return "user_edit";
    }

    @PostMapping("/user/edit")
    public String editUser(@ModelAttribute User user){
        userService.update(user);
        return "redirect:/home/user/all";
    }

}

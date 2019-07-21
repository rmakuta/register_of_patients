package pl.makuta.register_of_patients.card;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.makuta.register_of_patients.company.CompanyService;
import pl.makuta.register_of_patients.qualification.QualificationService;
import pl.makuta.register_of_patients.testing.TestingService;
import pl.makuta.register_of_patients.user.UserService;

@Controller
@RequestMapping
@Data
public class CardController {

    private CardService cardService;
    private UserService userService;
    private CompanyService companyService;
    private QualificationService qualificationService;
    private TestingService testingService;

    @Autowired
    public CardController(CardService cardService, UserService userService, CompanyService companyService, QualificationService qualificationService, TestingService testingService) {
        this.cardService = cardService;
        this.userService = userService;
        this.companyService = companyService;
        this.qualificationService = qualificationService;
        this.testingService = testingService;
    }

    @GetMapping("/home")
    public String showCards(Model model){
        model.addAttribute("cards", cardService.findAll());
        return "card_all";
    }

    // dodawanie

    @GetMapping("/home/card/add")
    public String addCard(Model model) {
        model.addAttribute("card", new Card());
        model.addAttribute("users", userService.findAll());
        model.addAttribute("companies", companyService.findAll());
        model.addAttribute("companiess", companyService.findAll());
        model.addAttribute("qualifications", qualificationService.findAll());
        model.addAttribute("testings", testingService.findAll());
        return "card_add";
    }

    @PostMapping("/home/card/add")
    public String addCard(@ModelAttribute Card card){
        cardService.add(card);
        return "redirect:/home";
    }

    // usuwanie

    @RequestMapping("/home/card/delete/{id}")
    public String deleteCard(@PathVariable Long id){
        cardService.delete(cardService.findById(id));
        return "redirect:/home";
    }

    // edycja

    @GetMapping("/home/card/edit/{id}")
    public String editCard(@PathVariable Long id, Model model){
        System.out.println("plum");
        model.addAttribute("card", cardService.findById(id));
        model.addAttribute("users", userService.findAll());
        model.addAttribute("companies", companyService.findAll());
        model.addAttribute("companiess", companyService.findAll());
        model.addAttribute("qualifications", qualificationService.findAll());
        model.addAttribute("testings", testingService.findAll());
        return "card_edit";
    }

    @PostMapping("/home/card/edit")
    public String editCard(@ModelAttribute Card card){
        cardService.update(card);
        return "redirect:/home";
    }
}

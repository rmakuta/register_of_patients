package pl.makuta.register_of_patients.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class TestingController {

    private TestingService testingService;

    @Autowired
    public TestingController(TestingService testingService) {
        this.testingService = testingService;
    }

    @GetMapping("/testing/all")
    public String showTestings(Model model){
        model.addAttribute("testings", testingService.findAll());
        return "testing_all";
    }

    // dodawanie

    @GetMapping("/testing/add")
    public String addTesting(Model model) {
        model.addAttribute("testing", new Testing());
        return "testing_add";
    }

    @PostMapping("/testing/add")
    public String addTesting(@ModelAttribute Testing testing){
        testingService.add(testing);
        return "redirect:all";
    }

    // usuwanie

    @RequestMapping("/testing/delete/{id}")
    public String deleteTesting(@PathVariable Long id){
        testingService.delete(testingService.findById(id));
        return "redirect:/home/testing/all";
    }

    // edycja

    @GetMapping("/testing/edit/{id}")
    public String editTesting(@PathVariable Long id, Model model){
        model.addAttribute("testing", testingService.findById(id));
        return "testing_edit";
    }

    @PostMapping("/testing/edit")
    public String editTesting(@ModelAttribute Testing testing){
        testingService.update(testing);
        return "redirect:/home/testing/all";
    }

    //TODO przeliczanie wynikóœ na bazie badania i parametrów badanego (wiek)
}

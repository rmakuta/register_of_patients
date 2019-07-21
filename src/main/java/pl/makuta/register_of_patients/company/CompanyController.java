package pl.makuta.register_of_patients.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company/all")
    public String showCompany(Model model){
        model.addAttribute("companies" , companyService.findAll());
        return "company_all";
    }

// dodawanie

    @GetMapping("/company/add")
    public String addCompany(Model model) {
        model.addAttribute("company", new Company());
        return "company_add";
    }

    @PostMapping("/company/add")
    public String addCompany(@ModelAttribute Company company){
        companyService.add(company);
        return "redirect:all";
    }

// usuwanie

    @RequestMapping("/company/delete/{id}")
    public String deleteCompany(@PathVariable Long id){
        System.out.println("plum");
        companyService.delete(companyService.findById(id));
        return "redirect:/home/company/all";
    }


// edycja

    @GetMapping("/company/edit/{id}")
    public String editCompany(@PathVariable Long id, Model model){
        model.addAttribute("company", companyService.findById(id));
        return "company_edit";
    }

    @PostMapping("/company/edit")
    public String ediCompany(@ModelAttribute Company company){
        companyService.update(company);
        return "redirect:/home/company/all";
    }
}

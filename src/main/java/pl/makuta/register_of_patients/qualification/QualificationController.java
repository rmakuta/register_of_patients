package pl.makuta.register_of_patients.qualification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class QualificationController {

    private QualificationService qualificationService;

    @Autowired
    public QualificationController(QualificationService qualificationService) {
        this.qualificationService = qualificationService;
    }
    @GetMapping("/qualification/all")
    public String showQaulification(Model model){
        model.addAttribute("qualifications", qualificationService.findAll());
        return "qualification_all";
    }

    @GetMapping("/qualification/add")
    public String addQualification(Model model) {
        model.addAttribute("qualification", new Qualification());
        return "qualification_add";
    }

    @PostMapping("/qualification/add")
    public String addQualification(@ModelAttribute Qualification qualification){
        qualificationService.add(qualification);
        return "redirect:all";
    }

    @RequestMapping("/qualification/delete/{id}")
    public String deleteQualification(@PathVariable Long id){
        qualificationService.delete(qualificationService.findById(id));
        return "redirect:/home/qualification/all";
    }

    @GetMapping("/qualification/edit/{id}")
    public String editQualification(@PathVariable Long id, Model model){
        model.addAttribute("qualification", qualificationService.findById(id));
        return "qualification_edit";
    }

    @PostMapping("/qualification/edit")
    public String editQualificaton(@ModelAttribute Qualification qualification){
        qualificationService.update(qualification);
        return "redirect:/home/qualification/all";
    }

}

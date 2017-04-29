package pl.musicstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchingController {

    @GetMapping("/searching")
    public String searchingForm(Model model) {
        model.addAttribute("searching", new Searching());
        return "searching";
    }

    @PostMapping("/searching")
    public String searchingSubmit(@ModelAttribute Searching searching) {
        return "result";
    }

}
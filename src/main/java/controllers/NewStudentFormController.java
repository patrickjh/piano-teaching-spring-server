package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by patrick on 6/17/2017.
 */

@Controller
public class NewStudentFormController {

    @GetMapping("/")
    public String newStudentForm() {
        return "newStudentForm";
    }
}

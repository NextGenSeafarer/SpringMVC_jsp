package com.ilia.springMVC;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("employee")
//@RequestMapping can be used for the controller itself, that will
//apply the url for all methods include in the class of the controller
public class AskAndShowDetailsController {


    @RequestMapping("/")
    public String homeGetRequest() {
        return "home";
    }

    @RequestMapping("ask")
    public String askDetails(Model model) {

        model.addAttribute("employee", new Employee());
        return "askForm";
    }

//    @RequestMapping("/show")
//    public String showDetails() {
//        return "showForm";
//    }

//    @RequestMapping("/show")
//    public String showDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("name", empName);
//        return "showForm";
//    }

//    @RequestMapping("show")
//    public String showDetails(@RequestParam("employeeName") String empName, Model model) {
//        // for the assigning @RequestParam it can be used name ="..."
//
//        empName = "Mr. " + empName;
//        model.addAttribute("name", empName);
//        return "showForm";
//    }

    @RequestMapping("show")
    public String showDetails(@ModelAttribute("employee") Employee emp) {

        return "showForm";
    }

}

package org.krish.springmvc.controller;

import org.krish.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String,String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model)
    {
        model.addAttribute("student",new Student()); // Creating a Model attribute which will be referred from JSP

        // add the country options to the model
        model.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student)   //Binding the model attribute to this Student obj
    {
        String msg = "Hii, "+student.getfName()+" "+student.getlName();

        System.out.println(msg);

        return "student-confirmation";
    }
}

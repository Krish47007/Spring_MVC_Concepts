package org.krish.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/show")
    public String showForm()
    {
        return "helloworld-form";
    }

    @RequestMapping("/process")
    public String processForm()
    {
        return "helloworld";
    }

    // A method to read form data and add it to Model
    @RequestMapping("/processNewForm")
    public String newProcessForm(HttpServletRequest request, Model model)
    {
        String userName = request.getParameter("userName");

        userName = userName.toUpperCase();

        String msg = "Yo!! "+userName;

        //Adding into the Model
        model.addAttribute("message",msg);    //K-V pair..key name can be anything

        return "helloworld";
    }
}

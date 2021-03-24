package org.krish.springmvc.controller;

import org.krish.springmvc.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    /*
    *   It intercepts every web requests.It pre-processes every String form data by
    *   removing leading and trailing white spaces. If String has only whitespace then it trims
    *   it down to null.
    * */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);

        binder.registerCustomEditor(String.class,editor);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/showForm")
    public String showForm(Model model)
    {
        model.addAttribute("customer",new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, //Telling Spring to do validation on Customer object
                              BindingResult result)     //Spring stores result of validation in BindingResult object
    {
        if(result.hasErrors())
            return "customer-form";
        else
            return "customer-confirmation";
    }
}

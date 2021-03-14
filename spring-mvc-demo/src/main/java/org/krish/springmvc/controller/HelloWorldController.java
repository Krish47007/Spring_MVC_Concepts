package org.krish.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

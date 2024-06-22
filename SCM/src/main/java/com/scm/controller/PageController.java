package com.scm.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 

@Controller
public class PageController {

 @RequestMapping( path = "/home",method = RequestMethod.GET )
  public String home(Model model   ){


    // ! Data Sending to view
      model.addAttribute("name", "Nihalahmad");
      model.addAttribute("surname", "Sherkar");
      model.addAttribute("google", "https://www.google.co.in/");


    System.out.println("Home Page Handler");
    return "home";
  }

}

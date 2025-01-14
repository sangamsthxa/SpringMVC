package org.sangam.springmvc;

import org.sangam.springmvc.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
    @ModelAttribute
    public void modelData(Model model){
        model.addAttribute("name", "Aliens");
    }
    @RequestMapping("/")
    public String Home(){
        System.out.println("Home Page Requested.");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView Add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
    int num3 = num1 + num2;
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("result");
    modelAndView.addObject("num3", num3);
    return modelAndView;
    }

    @RequestMapping("addAlien")
    public String Add(@ModelAttribute Alien alien){
        return "result";
    }

}

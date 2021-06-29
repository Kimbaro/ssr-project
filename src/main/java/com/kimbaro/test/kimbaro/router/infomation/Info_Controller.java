package com.kimbaro.test.kimbaro.router.infomation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/info")
public class Info_Controller {
    @GetMapping("/index")
    public String getInfo(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("age", 27);
        return "/info/index";
    }
}

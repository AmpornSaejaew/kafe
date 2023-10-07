package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/") //ทุก Rest get post put delete จะมาที่นี่หมด
    public String getHomePage(Model model){
        model.addAttribute("greeting","Sawaddee"); // key : value
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home"; // return template name
    }
}

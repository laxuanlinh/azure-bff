package com.com.azurebff;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WebController {

    @GetMapping("/login")
    public RedirectView login(){
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://login.microsoftonline.com/1a4c120c-a869-44c9-a51b-74538a67d4dd/v2.0");
        return redirectView;
    }

}

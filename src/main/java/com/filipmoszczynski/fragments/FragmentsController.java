package com.filipmoszczynski.fragments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {

    @GetMapping("/fragments")
    public String getMFragmentsExample(){
        return "fragments/index.html";
    }

}

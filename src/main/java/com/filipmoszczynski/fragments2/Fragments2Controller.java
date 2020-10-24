package com.filipmoszczynski.fragments2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Fragments2Controller {

    @GetMapping("fragments2")
    public  String getFragmentsExample() {
        return "fragments2/index.html";
    }
}

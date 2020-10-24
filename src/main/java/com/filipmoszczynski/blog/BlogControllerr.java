package com.filipmoszczynski.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogControllerr {

    @GetMapping({"/blog"})
    public String getBlog() {
        return"blog/index.html";
    }
}

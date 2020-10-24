package com.filipmoszczynski.blog;

import com.filipmoszczynski.blog.menu.MenuDto;
import com.filipmoszczynski.blog.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    public BlogController(MenuService menuService) {
        this.menuService = menuService;
    }

    private MenuService menuService;

    @GetMapping({"/blog"})
    public String getBlog(Model model) {
        List<MenuDto> menuItems = menuService.getMenu();
        model.addAttribute("menuItems", menuItems);
        return"blog/index.html";
    }
}

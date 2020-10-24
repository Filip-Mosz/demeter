package com.filipmoszczynski.blog.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu(){
        return List.of(
            new MenuDto("World"),
                new MenuDto("Technology"),
                new MenuDto("Design"),
                new MenuDto("Culture"),
                new MenuDto("Business"),
                new MenuDto("Politics"),
                new MenuDto("Opinion"),
                new MenuDto("Science"),
                new MenuDto("Health"),
                new MenuDto("Style"),
                new MenuDto("Travel")
        );
    }
}

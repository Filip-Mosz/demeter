package com.filipmoszczynski.blog;

import com.filipmoszczynski.blog.menu.MenuDto;
import com.filipmoszczynski.blog.menu.MenuService;
import com.filipmoszczynski.blog.post.PostDto;
import com.filipmoszczynski.blog.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogRestController {

    @Autowired
    public BlogRestController(MenuService menuService, PostService postService) {
        this.menuService = menuService;
        this.postService = postService;
    }

    final private MenuService menuService;
    final private PostService postService;

    @GetMapping("/api/blog/menu")
    public List<MenuDto> getMenu() {
        return menuService.getMenu();
    }

    @GetMapping("/api/blog/posts")
    public List<PostDto> getPosts() {
        return postService.getPosts();
    }
}

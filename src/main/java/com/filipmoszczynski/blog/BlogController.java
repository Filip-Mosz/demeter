package com.filipmoszczynski.blog;

import com.filipmoszczynski.blog.menu.MenuDto;
import com.filipmoszczynski.blog.menu.MenuService;
import com.filipmoszczynski.blog.post.PostDto;
import com.filipmoszczynski.blog.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    public BlogController(MenuService menuService, PostService postService) {
        this.menuService = menuService;
        this.postService = postService;
    }

    private final MenuService menuService;
    private final PostService postService;

    @GetMapping({"/blog"})
    public String getBlog(Model model) {

        List<PostDto> posts = postService.getPosts();
        List<MenuDto> menuItems = menuService.getMenu();

        model.addAttribute("menuItems", menuItems);
        model.addAttribute("posts", posts);

        return"blog/index.html";
    }

    @GetMapping({"/blog/{id}"})
    public String getBlogPost(@PathVariable("id") String id, Model model) {
        Optional<PostDto> post = postService.getPost(id);
        List<MenuDto> menuItems = menuService.getMenu();
        model.addAttribute("post", getPost(post.get()));
        model.addAttribute("menuItems", menuItems);
        return "blog/post.html";
    }
    private PostDto getPost(PostDto post) { return post.setContent(post.getContent().repeat(50));  }
}

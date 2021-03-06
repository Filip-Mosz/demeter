package com.filipmoszczynski.blog.post;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private static final ObjectMapper MAPPER = new ObjectMapper(); //to parsuje json na object
    private static final Logger LOGGER = LoggerFactory.getLogger(PostService.class);

    public List<PostDto> getPosts(){
        try {
            return MAPPER.readValue(
                    getClass().getClassLoader().getResource("post.json"), //to wskazuje na lokalizację zależną od umiejscowienia appki
                    MAPPER.getTypeFactory().constructCollectionType(List.class, PostDto.class)
                    //a mapuje w ten sposób
            );
        } catch (IOException e) {
            LOGGER.error("Error{}", e.getLocalizedMessage());
            return List.of();
        }
    }

    public Optional<PostDto> getPost(String id) {
        return getPosts()
                .stream()
                .filter(post->post.getId().equalsIgnoreCase(id))
                .findFirst();
    }
}

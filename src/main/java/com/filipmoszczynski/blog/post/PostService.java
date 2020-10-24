package com.filipmoszczynski.blog.post;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PostService {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(PostService.class);

    public List<PostDto> getPosts(){
        try {
            return MAPPER.readValue(
                    getClass().getClassLoader().getResource("post.json"),
                    MAPPER.getTypeFactory().constructCollectionType(List.class, PostDto.class)
            );
        } catch (IOException e) {
            LOGGER.error("Error{}", e.getLocalizedMessage());
            return List.of();
        }
    }
}

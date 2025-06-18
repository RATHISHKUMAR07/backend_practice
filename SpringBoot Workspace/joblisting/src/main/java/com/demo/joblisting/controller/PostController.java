package com.demo.joblisting.controller;

import com.demo.joblisting.PostRepository;
import com.demo.joblisting.model.Post;
import com.demo.joblisting.service.PostService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

//    @ApiIgnore
//    @RequestMapping(value="/")
//    public void redirect(HttpServletResponse response) throws IOException {
//        response.sendRedirect("/swagger-ui.html");
//    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return postService.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return  postRepository.save(post);
    }
}

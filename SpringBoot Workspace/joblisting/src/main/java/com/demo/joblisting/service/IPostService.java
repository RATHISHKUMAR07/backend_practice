package com.demo.joblisting.service;

import com.demo.joblisting.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPostService {

    List<Post> findByText(String text);

}

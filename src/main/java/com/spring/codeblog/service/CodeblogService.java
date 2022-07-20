package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;
import java.util.List;

/**
 *Interface com os metodos a serem implementados
 * @author iddsp
 */

public interface CodeblogService {
    
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
    
}

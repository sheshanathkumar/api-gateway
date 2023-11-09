package com.shesho.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleCoontroller {


    @GetMapping("/test")
    public String testApi () {
        return "Test success from article";
    }


}

package com.shesho.source;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/source")
public class SourceController {

    @GetMapping("/get")
    public String getTest () {
        return "Test Success from Source";
    }

}

package com.example.test1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/lilith")
    public String getLilith() {
        return "Lilith";
    }
}

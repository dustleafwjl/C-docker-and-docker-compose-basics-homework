package com.thoughtworks.capability.gtb.bob;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BobApi {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello from Bob";
    }
}

package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceApi {
    private RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/hello")
    public String getHelloFromBob() {
        return restTemplate.getForObject("http://localhost:8081/hello", String.class);
    }
}

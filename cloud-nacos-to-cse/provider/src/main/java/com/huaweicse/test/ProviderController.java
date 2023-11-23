package com.huaweicse.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController implements ProviderService {
    @Value("${current.engine}")
    private String engine;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return "hello " + name + ", the demo is for " + engine;
    }

}

package com.huawei.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProviderController {

  @Value("${test.strValue:1}")
  private String strValue;

  @GetMapping("/sayHello")
  public String sayHello(@RequestParam("name") String name) {
    return "Hello name--------" + name + ";strValue----" + strValue;
  }
}

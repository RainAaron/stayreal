package com.stayreal.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@RequestMapping
public class ConsumerRestController {
  @Autowired
  private ProducerServiceClient applicationClient;

  @GetMapping("/hello")
  public String hello() {
    return applicationClient.get();
  }
}

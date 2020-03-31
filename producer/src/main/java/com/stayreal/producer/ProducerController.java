package com.stayreal.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/producer")
public class ProducerController {

  @GetMapping("/hello")
  public String hello() {
    return "Producer";
  }
}

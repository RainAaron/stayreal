package com.stayreal.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name = "producer",
    fallback = ProducerServiceClient.ProducerServiceClientHystrix.class
)
@Primary
public interface ProducerServiceClient {

  @GetMapping("/producer/hello")
  String get();

  @Component
  class ProducerServiceClientHystrix implements ProducerServiceClient {

    @Override
    public String get() {
      return "hystrix";
    }
  }
}

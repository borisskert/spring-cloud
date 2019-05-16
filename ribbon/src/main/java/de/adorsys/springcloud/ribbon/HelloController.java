package de.adorsys.springcloud.ribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(value = "hello-world")
public interface HelloController {

    @GetMapping("/hello")
    String getHello();
}

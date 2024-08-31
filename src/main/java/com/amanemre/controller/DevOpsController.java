package com.amanemre.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DevOpsController {

  @GetMapping
  public String devopsHello() {
    return "DevOps Hello : " + LocalDateTime.now();
  }

  @GetMapping("/info")
  public String devopsInfo() {
    return "INFO : " + LocalDateTime.now();
  }

}

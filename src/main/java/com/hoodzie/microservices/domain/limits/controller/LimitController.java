package com.hoodzie.microservices.domain.limits.controller;

import com.hoodzie.microservices.domain.limits.business.abstracts.LimitService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/users")
@Tag(name = "User Controller")
public class LimitController {

  private LimitService limitService;

}

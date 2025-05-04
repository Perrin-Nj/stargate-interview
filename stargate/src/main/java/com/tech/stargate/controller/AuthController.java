package com.tech.stargate.controller;

import com.tech.stargate.model.UserInfo;
import com.tech.stargate.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/v1"))
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  @GetMapping
  public UserInfo validateUser() {
    return authService.getValidateDetails();
  }
}

package com.tech.stargate.service;

import com.tech.stargate.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

  @Override
  public UserInfo getValidateDetails() {
    return UserInfo.builder()
        .status("verified")
        .name("John Doe")
        .imageUrl("imageUrl")
        .profession("PROFESSIONAL PLUMBER")
        .build();
  }
}

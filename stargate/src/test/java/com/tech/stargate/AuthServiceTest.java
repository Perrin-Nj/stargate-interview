package com.tech.stargate;

import com.tech.stargate.service.AuthServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;


public class AuthServiceTest {

  @InjectMocks AuthServiceImpl authService;

  @Test
  void testSuccessfulAPIResponse() {
    Assertions.assertEquals("imageUrl", authService.getValidateDetails().imageUrl());
  }
}

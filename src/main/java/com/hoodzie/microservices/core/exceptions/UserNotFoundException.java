package com.hoodzie.microservices.core.exceptions;

import java.io.Serial;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = -726889601728813678L;

  public UserNotFoundException(String message) {
    super(message);
  }

}

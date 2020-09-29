package com.crudcliente.crudbackend;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class NotFoundExceptionMessage extends RuntimeException {
  
  public NotFoundExceptionMessage (String message) {
    super(message);
  }
}

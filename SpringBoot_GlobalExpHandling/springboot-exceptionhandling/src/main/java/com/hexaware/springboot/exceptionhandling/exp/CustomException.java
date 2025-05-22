package com.hexaware.springboot.exceptionhandling.exp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Custom Exception Occur", value = HttpStatus.BAD_REQUEST)
public class CustomException  extends Exception {

}

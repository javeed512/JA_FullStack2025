package com.hexaware.springrest.datajpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Employee Not Found for given Eid", code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException  extends  Exception {

}

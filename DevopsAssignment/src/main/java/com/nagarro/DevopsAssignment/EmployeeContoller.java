package com.nagarro.DevopsAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeContoller {
	
	@GetMapping("/name")
	public String employeeName() {
		return "Prasanth";
	}
}

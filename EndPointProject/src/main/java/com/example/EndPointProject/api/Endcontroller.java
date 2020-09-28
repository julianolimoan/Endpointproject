package com.example.EndPointProject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.EndPointProject.service.EndPointService;

@RequestMapping("api/v1/get")
@RestController
public class Endcontroller {

	private final EndPointService endPointservice;
@Autowired
	public Endcontroller(EndPointService endPointservice) {
		this.endPointservice = endPointservice;
	}
@GetMapping(path ="{x}" )
	public String getResult(@PathVariable("x") int p) {
		if (p < 0) {
			throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST);
		}else {
			return endPointservice.calculateNumbre(p);
		}
		
	}
}

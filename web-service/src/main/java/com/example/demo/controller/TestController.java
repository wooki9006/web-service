package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@CrossOrigin
	@GetMapping(value = "welcome")
	public String checkHealth(HttpServletRequest request, HttpServletResponse response) {
		return "환영합니다. web-service입니다.";
	}
}

package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getcondata")
	public List getConData(){
		String url = "http://localhost:9092/getprodata";
		List al = rt.getForObject(url, List.class);
		return al;
	}
}

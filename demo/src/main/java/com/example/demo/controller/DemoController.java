package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;
/**---**/
@RestController
public class DemoController {
	@Autowired
	DemoService demoService;
	/**---**/
	@GetMapping("/{number}")
	public int updateCount(@PathVariable int number) {
		return demoService.updateCount(number);
	

}
}
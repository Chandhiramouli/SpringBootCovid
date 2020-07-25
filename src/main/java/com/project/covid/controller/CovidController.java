package com.project.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.covid.model.Covid;
import com.project.covid.service.CovidService;
@CrossOrigin(origins="*")
@RestController
public class CovidController {

	@Autowired
	public CovidService service;
	
	@GetMapping("/get")
	public List<Covid> get(){
		return service.getPaitent();
	}
	
	@PostMapping("/post")
	public Covid post(@RequestBody Covid covid) {
		return service.CovidSave(covid);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		return service.CovidDelete(id);
	}
}

package com.project.covid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.covid.model.Covid;
import com.project.covid.repository.CovidRepository;

@Service
public class CovidService {

	@Autowired
	public CovidRepository repository;
	
	public List<Covid> getPaitent(){
		return repository.findAll();
	}
	
	public Covid CovidSave(Covid covid)
	{
		return repository.save(covid);
	}
	public String CovidDelete(Integer id)
	{
		repository.deleteById(id);
		return "Deleted successfully " + id;
	}
}

package com.project.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.covid.model.Covid;

public interface CovidRepository extends JpaRepository<Covid,Integer>{

}

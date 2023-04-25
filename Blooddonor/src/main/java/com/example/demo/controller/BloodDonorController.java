package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BloodDonorService;
import com.example.demo.model.Demo1;

@RestController
public class BloodDonorController {
	@Autowired

    BloodDonorService bdService;
	
	@PostMapping(value="/SaveDonors")
	public Demo1 saveDemo1(@RequestBody Demo1 s)
	{
		return bdService.saveDemo1(s); 
	}
	
	@PutMapping(value="/updateDonors")
	public Demo1 updateDemo1(@RequestBody Demo1 s)
	{
		return bdService.updateDemo1(s);
	}
	@DeleteMapping(value="/deleteDonors/{id}")
	public String deleteDemo1(@PathVariable("id")int id)
	{
		bdService.deleteDemo1(id);
		return "Deleted Successfully";
	}
	
	@GetMapping(value="/fetchDonors/{id}")
    public Optional<Demo1> getDemo1(@PathVariable("id")int id)
    {
    	return bdService.getDemo1byId(id);
    }
	
	
}



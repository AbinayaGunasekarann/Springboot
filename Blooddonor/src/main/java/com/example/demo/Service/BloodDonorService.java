package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.donor;
import com.example.demo.model.Demo1;

@Service
public class BloodDonorService {
	@Autowired
	donor bddao;
	public List<Demo1> getAllDonors()
	{
		List<Demo1> bdList=bddao.findAll();
		return bdList;
		
	}
	public Demo1 saveDemo1(Demo1 s)
	{
		Demo1 obj=bddao.save(s);
		return obj;
	}
	public Demo1 updateDemo1(Demo1 s)
	{
		Demo1 obj=bddao.save(s);
		return obj;
	}
	public void deleteDemo1(int id)
	{
		bddao.deleteById(id);
	}
	public Optional<Demo1> getDemo1byId(int id)
	{
		return bddao.findById(id);
	}
}


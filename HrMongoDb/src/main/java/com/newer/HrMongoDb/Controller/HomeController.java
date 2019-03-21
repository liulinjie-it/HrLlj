package com.newer.HrMongoDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newer.HrMongoDb.HR;
import com.newer.HrMongoDb.Repository.homeRepository;
@RestController
@CrossOrigin
public class HomeController {
	
	@Autowired
	homeRepository hrt;
	
	@GetMapping("/hrlist")
	public List<HR> findall(){
		System.out.println(hrt.count());
		return  hrt.findAll();
	}
	@PostMapping("/hradd")
	public List<HR> add(@RequestBody HR hr){
		
		hrt.insert(hr);
		return hrt.findAll();
		
	}
	
	@PostMapping("/hrdlt")
    public List<HR> dlt(@RequestBody HR hr){
		hrt.deleteById(hr.getId());
		return hrt.findAll();
	}
}

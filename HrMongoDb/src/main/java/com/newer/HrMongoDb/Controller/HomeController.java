package com.newer.HrMongoDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newer.HrMongoDb.HR;
import com.newer.HrMongoDb.Jobs;
import com.newer.HrMongoDb.Repository.homeRepository;
import com.newer.HrMongoDb.Repository.jobRepository;
@RestController
@CrossOrigin
public class HomeController {
	
	@Autowired
	homeRepository hrt;
	@Autowired
	jobRepository jrt;
	
	@GetMapping("/hrlist")
	public List<HR> findall(){
		System.out.println(hrt.count());
		return  hrt.findAll();
	}
	@GetMapping("/jblist")
	public List<Jobs> joball(){
		
		return jrt.findAll();
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
	@PostMapping("/hrupdt")
	public List<HR> updt(@RequestBody HR hr){
		
		hrt.save(hr);
		System.out.println("成功修改");
		return hrt.findAll();
	}
}

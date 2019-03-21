package com.newer.HRMGDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newer.HRMGDB.HR;
import com.newer.HRMongoDB.Repository.HRRepository;

@RestController
@CrossOrigin
public class HomeController {
    
	@Autowired
	HRRepository hrt;
	
	@GetMapping("/hrlist")
	public List<HR> hrlist(){
		System.out.println(hrt.count());
		return hrt.findAll();
	}
	
	@PostMapping("/hradd")
	public List<HR> hradd(@RequestBody HR hr) {
		
		System.out.println(hr.toString());
		HR h = new HR(hr.getHrid(), hr.getName(), hr.getJob(), hr.getPhone());
		hrt.insert(h);
		System.out.println("访问成功");
		return hrt.findAll();
	}
	@PostMapping("/hrup")
	public List<HR> hrup(){
		return hrt.findAll();
	} 
	@PostMapping("/hrdlt")
	public List<HR> hrdlt(@RequestBody HR hr){
		System.out.println(hr.getId());
		hrt.deleteById(hr.getId());
		return hrt.findAll();
	}
}
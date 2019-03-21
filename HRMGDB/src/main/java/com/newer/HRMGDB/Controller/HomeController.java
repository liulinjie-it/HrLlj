package com.newer.HRMGDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.newer.HRMGDB.HR;
import com.newer.HRMongoDB.Repository.HRRepository;



@CrossOrigin
@Controller
public class HomeController {
    
	@Autowired
	HRRepository hrr;
	
	@GetMapping("/hrlist")
	public List<HR> hrlist(){
		System.out.println(hrr.count());
		return hrr.findAll();
	}
	
	@PostMapping("/hradd")
	public List<HR> hradd(@RequestBody HR hr) {
		
		System.out.println(hr.toString());
		HR h = new HR(hr.getHrid(), hr.getName(), hr.getJob(), hr.getPhone());
		hrr.insert(h);
		System.out.println("访问成功");
		return hrr.findAll();
	}
	@PostMapping("/hrup")
	public List<HR> hrup(@RequestBody HR hr){
		hrr.save(hr);
		return hrr.findAll();
	} 
	@PostMapping("/hrdlt")
	public List<HR> hrdlt(@RequestBody HR hr){
		System.out.println(hr.getId());
		hrr.deleteById(hr.getId());
		return hrr.findAll();
	}
}
package com.newer.HrMongoDb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newer.HrMongoDb.HR;
import com.newer.HrMongoDb.Jobs;
import com.newer.HrMongoDb.PageModel.PageModel;
import com.newer.HrMongoDb.PageModel.SpringbootPageable;
import com.newer.HrMongoDb.Repository.homeRepository;
import com.newer.HrMongoDb.Repository.jobRepository;
@RestController
@CrossOrigin
public class HomeController {
	int index = 1;
	int size = 5;
	@Autowired
	homeRepository hrt;
	
	@GetMapping("/hrlist/{nm}")
	public List<HR> findall(@PathVariable int nm){
//		System.out.println(hrt.count());
		index = nm;
		System.out.println(nm);
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, "id"));
		Sort sort = new Sort(orders);
		PageModel pModel = new PageModel(index, size,sort);
		SpringbootPageable springbootPageable =new SpringbootPageable(pModel);
		return hrt.findAll(springbootPageable).getContent();
	}
	@GetMapping("/hrnums")
	public List<Integer> hrnums(){
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, "id"));
		Sort sort = new Sort(orders);
		PageModel pModel = new PageModel(1, size,sort);
		SpringbootPageable springbootPageable =new SpringbootPageable(pModel);
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i <= hrt.findAll(springbootPageable).getTotalPages(); i++) {
			nums.add(i);
		}
		return nums;
	}
	
	@PostMapping("/hradd")
	public List<HR> add(@RequestBody HR hr){ 
		hrt.insert(hr);
		if(hrt.count()%5==1) {
		  index = index+1;
		}
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, "id"));
		Sort sort = new Sort(orders);
		PageModel pModel = new PageModel(index, size,sort);
		SpringbootPageable springbootPageable =new SpringbootPageable(pModel);
		return hrt.findAll(springbootPageable).getContent();
		
	}
	
	
	@PostMapping("/hrdlt")
    public List<HR> dlt(@RequestBody HR hr){
		hrt.deleteById(hr.getId());	
		if(hrt.count()%5==0) {
			  index = index-1;
		}
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, "id"));
		Sort sort = new Sort(orders);
		PageModel pModel = new PageModel(index, size,sort);
		SpringbootPageable springbootPageable =new SpringbootPageable(pModel);
		return hrt.findAll(springbootPageable).getContent();
	}
	@PostMapping("/hrupdt")
	public List<HR> updt(@RequestBody HR hr){
		
		hrt.save(hr);
		System.out.println("成功修改");
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(Direction.ASC, "id"));
		Sort sort = new Sort(orders);
		PageModel pModel = new PageModel(index, size,sort);
		SpringbootPageable springbootPageable =new SpringbootPageable(pModel);
		return hrt.findAll(springbootPageable).getContent();
	}
}

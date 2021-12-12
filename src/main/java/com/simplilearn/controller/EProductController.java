package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.dao.EProductDao;
import com.simplilearn.model.EProduct;
import com.simplilearn.publisher.EventPublisher;

@Controller
public class EProductController {
	
	@Autowired
	EProductDao eProductDao;
	
	@Autowired
	EventPublisher ep;
	
	
	@GetMapping("/listProducts")
	public String listProduct(Model model) {
		List<EProduct> products = eProductDao.getProducts();
		model.addAttribute("products", products);
		return "listProducts";
	}
	
	@GetMapping("/publish")
	public String publish() {
		this.ep.publish();
		return "publish";
	}
	

}

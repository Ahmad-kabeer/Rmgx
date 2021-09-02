package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private CategoryService categoryService;

	@PostMapping(path = "/addCategory")
	public String addCategory(@RequestBody Category model) {

		try {
			categoryRepo.save(model);
		} catch (Exception e) {
			return "Something went Wrong" + e;
		}

		return "Category Added Succeccfully";
	}
	
	@PostMapping(path = "/updateCategory")
	public String updateCategory(@RequestBody Category model) {
		
		try {
			categoryService.updateCategory(model);
		} catch (Exception e) {
			return "Something went Wrong" + e;
		}

		return "Category Updated Succeccfully";
	}

	@GetMapping(path = "/listallcategory")
	public Map<String, Object> listAllCategory(){
		
		Map<String, Object> data=new HashMap<String, Object>();
		
		List<Category> returnData=new ArrayList<Category>();
		
		try {
			returnData=categoryRepo.findAll();
		} catch (Exception e) {
			data.put("Result", "Fail");
			data.put("Data", e);
			return data;
		}
		
		data.put("Result", "Success");
		data.put("Data", returnData);
		return data;
	}
}

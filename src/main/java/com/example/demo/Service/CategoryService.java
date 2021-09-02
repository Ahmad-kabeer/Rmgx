package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo; 

	public void updateCategory(Category model) {
		Category databaseModel=categoryRepo.findData(model.getId());
		
		databaseModel.setName(model.getName());
		databaseModel.setDescription(model.getDescription());
		
		categoryRepo.save(databaseModel);
		
	}

}

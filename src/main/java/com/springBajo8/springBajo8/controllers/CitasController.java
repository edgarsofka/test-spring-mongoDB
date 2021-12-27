package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.models.ProductDTO;
import com.springBajo8.springBajo8.repositories.IProductDAO;
import com.springBajo8.springBajo8.models.ProductDTO;
import com.springBajo8.springBajo8.repositories.IProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private IProductDAO repository;

	@PostMapping("/product")
	public ProductDTO create(@Validated @RequestBody ProductDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<ProductDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/product/{id}")
	public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO p) {
		return repository.save(p);

	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}

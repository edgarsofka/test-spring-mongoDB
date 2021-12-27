package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.models.CitasDTO;
import com.springBajo8.springBajo8.repositories.ICitasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/citas")
public class CitasController {

	@Autowired
	private ICitasDAO repository;

	@PostMapping("/citas")
	public CitasDTO create(@Validated @RequestBody CitasDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<CitasDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/citas/{id}")
	public CitasDTO update(@PathVariable String id, @Validated @RequestBody CitasDTO p) {
		return repository.save(p);

	}

	@DeleteMapping("/citas/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}

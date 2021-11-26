package teste.wr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.wr.entity.Factories;
import teste.wr.repository.FactoriesRepository;

@RestController
@RequestMapping({"/factories"})
public class FactoriesController {
	@Autowired
	private FactoriesRepository repo;
	
	
	public FactoriesController (FactoriesRepository factoryRepository) {
		this.repo = factoryRepository;
	}
	
	@GetMapping
	public List<Factories> get(){
		 return repo.findAll();
	}
	
	@PostMapping
	public Factories add(@RequestBody Factories factories) {
		return repo.save(factories);
	}
	
	@PutMapping(value="/{id}")
	public void update(@PathVariable("id") Long id , @RequestBody Factories factories) {
		factories.setName(factories.getName());
		factories.setCountryCode(factories.getCountryCode());
		repo.save(factories);		
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
	

}

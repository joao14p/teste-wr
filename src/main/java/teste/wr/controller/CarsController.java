package teste.wr.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import teste.wr.entity.Cars;
import teste.wr.repository.CarsRepository;

@RestController
@RequestMapping({"/cars"})
public class CarsController {
	
	@Autowired
	private CarsRepository repo;
	
	public CarsController(CarsRepository repo) {
		super();
		this.repo = repo;
	}

	@GetMapping
	public List<Cars> get(){
		 return repo.findAll();
	}
	
	@PostMapping
	public Cars add(@RequestBody Cars cars) {
		return repo.save(cars);
	}
	
	@PutMapping(value="/{id}")
	public void update(@PathVariable("id") Long id , @RequestBody Cars cars) {
		cars.setModel(cars.getModel());
		cars.setYear(cars.getYear());
		cars.setFuel(cars.getFuel());
		cars.setDoors(cars.getDoors());
		cars.setCost(cars.getCost());
		cars.setColor(cars.getColor());
		cars.setFactory_id(cars.getFactory_id());
		repo.save(cars);		
	}
	
	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
	
	
	@RequestMapping(value="/upload", method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam MultipartFile file) throws IOException {
		File convertFile = new File("C:\\Users\\JP\\Documents\\ws-sts\\teste\\src\\main\\java\\planilha\\"+file.getOriginalFilename());
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(file.getBytes());
		fout.close();
		return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
	}
	

}

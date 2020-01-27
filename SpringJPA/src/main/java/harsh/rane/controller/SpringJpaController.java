package harsh.rane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import harsh.rane.model.Element;
import harsh.rane.service.ElementServiceImpl;

@RestController
public class SpringJpaController {
	@Autowired
	ElementServiceImpl elementservice;

	@GetMapping
	public Element getElementDetails(@RequestParam(name = "id") int ElementId)
	 {
		
		return elementservice.getById(ElementId);
	}
	@GetMapping(value="getElementByName")
	public List<Element> getElementDetailsByName(@RequestParam(name = "sourceName") String SourceName)
	 {
		
		return elementservice.getBySourceName(SourceName);
	}

	@PostMapping
	public void postElementDetails(@RequestBody Element element) {

	}

	@PutMapping("put")
	public void putElementDetails(@RequestBody Element element) {

	}

	@DeleteMapping(value="/delete/element")
	public void DeleteElementDetails(@RequestParam(name = "id") int ElementId) {

		elementservice.deleteById(ElementId);
		System.err.println("deleted");
	}
}

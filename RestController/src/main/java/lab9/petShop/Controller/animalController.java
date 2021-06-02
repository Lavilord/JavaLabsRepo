package lab9.petShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lab9.petShop.animal.Animal;
import lab9.petShop.animal.Country;

@RestController
@RequestMapping(path = "/animal")
public class animalController {
	
	@Autowired
	private AnimalService animalService;
	
    @GetMapping
    public List<Animal> getAnimals(){
        return animalService.getAnimals();
    }
    
    @GetMapping(path = "/{id}")
    public Animal getAnimal(@PathVariable Integer id) {
    	return animalService.getAnimal(id);
    }
    
    @PutMapping
    public Animal createAnimal(@RequestBody Animal animal) {
    	return animalService.addAnimal(animal);
    }
    
    @PostMapping
    public ResponseEntity<Animal> updateAnimal(@RequestBody Animal animal){
    	if (animalService.getAnimal(animal.getId()) != null) {
    		return new ResponseEntity<Animal>(animalService.updateAnimal(animal),HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
    	}
    }
    

}

package lab9.petShop.rest.controller;

import java.util.List;
import java.util.logging.Logger;

import lab9.petShop.rest.exceptions.AnimalNotFoundException;
import lab9.petShop.rest.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lab9.petShop.animal.Animal;

@RestController
@RequestMapping(path = "/animal")
public final class AnimalController {

    private static final Logger LOGGER = Logger.getLogger("lab9.petShop.Controller");
	
	@Autowired
	private AnimalService animalService;
	
    @GetMapping
    public List<Animal> getAnimals() {

        return animalService.getAnimals();
    }
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<Animal> getAnimal(@PathVariable(name = "id") final Integer id) {
        try {
            return  new ResponseEntity<Animal>(animalService.getAnimal(id),HttpStatus.OK);
        } catch (AnimalNotFoundException e) {
            LOGGER.severe("Can't give an order with non-existing id" + id);
            return  new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    public  ResponseEntity<Animal> createAnimal(@RequestBody final Animal animal) {
    	if (animal.getId() == null) {
    		return new ResponseEntity<Animal>(animalService.addAnimal(animal),HttpStatus.OK);
    	}
    	LOGGER.severe("Failed to create an animal with passed id. Animal creation should not use external ids ");
    	return new ResponseEntity<Animal>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping
    public  ResponseEntity<Animal> updateAnimal(@RequestBody final Animal animal) {
        if (animal.getId() == null){
            LOGGER.severe("Can't update animal without id - null value was passed instead of it");
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
        try {
            return new ResponseEntity<Animal>(animalService.updateAnimal(animal), HttpStatus.OK);
        } catch (AnimalNotFoundException e) {
            LOGGER.severe("Can't update an animal with non-existing id: "+ animal.getId());
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping
    public List<Animal> deleteAnimals() {
        return animalService.deleteAnimals();
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Animal> deleteAnimal(@PathVariable(name = "id") final Integer id) {
        try {
            return new ResponseEntity<Animal>(animalService.deleteAnimal(id), HttpStatus.OK);
        } catch (AnimalNotFoundException e){
            LOGGER.severe("Can't delete an animal with non-existing id: "+ id);
            return  new ResponseEntity<Animal>(HttpStatus.BAD_REQUEST);
        }
    }


    

}

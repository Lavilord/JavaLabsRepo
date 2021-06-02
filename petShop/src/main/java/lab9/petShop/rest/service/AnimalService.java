package lab9.petShop.rest.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import lab9.petShop.rest.exceptions.AnimalNotFoundException;
import lab9.petShop.rest.dal.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import lab9.petShop.animal.Animal;

@Service
@ApplicationScope
public class AnimalService {

	@Autowired
	private AnimalRepository repository;

	private AtomicInteger id = new AtomicInteger(0);
	
	public Animal addAnimal(final Animal animal) {
		return repository.save(animal);
	}
	
	public Animal updateAnimal(final Animal animal) throws AnimalNotFoundException {
		if (repository.existsById(animal.getId())) {
			return repository.save(animal);
		}
		throw new AnimalNotFoundException();
	}
	
	public List<Animal> getAnimals() {
		return repository.findAll();
	}
	
	public Animal getAnimal(final Integer id) throws AnimalNotFoundException {
		if (repository.existsById(id)) {
			return repository.findById(id).orElseThrow();
		}
		throw new AnimalNotFoundException();
	}
	public List<Animal> deleteAnimals() {
		List<Animal> tempAnimals = repository.findAll();
		repository.deleteAll();
		return tempAnimals;
	}

	public Animal deleteAnimal(final Integer id) throws AnimalNotFoundException {
		if (repository.existsById(id)) {
			Animal tempAnimal = getAnimal(id);
			repository.deleteById(id);
			return tempAnimal;
		}
		else {
			throw new AnimalNotFoundException();
		}
	}


}

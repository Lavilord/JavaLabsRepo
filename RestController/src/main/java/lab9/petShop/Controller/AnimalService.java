package lab9.petShop.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import lab9.petShop.animal.Animal;

@Service
@ApplicationScope
public class AnimalService {
	
	private AtomicInteger id = new AtomicInteger(0);
	
	private Map<Integer, Animal> animalsMap = new HashMap<Integer, Animal>();
	
	public Animal addAnimal(Animal animal) {
		Integer animalId = id.incrementAndGet();
		animal.setId(animalId);
		animalsMap.put(animalId, animal);
		return animal;
	}
	
	public Animal updateAnimal(Animal animal) {
		return animalsMap.put(animal.getId(), animal);
	}
	
	public List<Animal> getAnimals(){
		return animalsMap.values().stream().collect(Collectors.toList());
	}
	
	public Animal getAnimal(Integer id) {
		return animalsMap.get(id);
	}
}

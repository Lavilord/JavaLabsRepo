package lab9.petShop.rest.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import lab9.petShop.animal.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}

package lab9.petShop.manager;

import lab9.petShop.animal.Animal;
import lombok.Getter;

import java.util.ArrayList;

public class ShopManager {
    @Getter
    private final ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void sortByPrice(final SortOrder order) {
        if (order == SortOrder.ASC) {
            animals.sort((Animal animal1, Animal animal2) -> animal1.getPrice() - animal2.getPrice());
        }
        if (order == SortOrder.DES) {
            animals.sort((Animal animal1, Animal animal2) -> animal2.getPrice() - animal1.getPrice());
        }
    }
    public void sortByWeightInGrams(final SortOrder order) {
        if (order == SortOrder.ASC) {
            animals.sort((Animal animal1, Animal animal2) -> animal1.getWeightInGrams() - animal2.getWeightInGrams());
        }
        if (order == SortOrder.DES) {
            animals.sort((Animal animal1, Animal animal2) -> animal2.getWeightInGrams() - animal1.getWeightInGrams());
        }
    }
    public void sortByEatsInGrams(final SortOrder order) {
        if (order == SortOrder.ASC) {
            animals.sort((Animal animal1, Animal animal2) -> animal1.getEatsInGrams() - animal2.getEatsInGrams());
        }
        if (order == SortOrder.DES) {
            animals.sort((Animal animal1, Animal animal2) -> animal2.getEatsInGrams() - animal1.getEatsInGrams());
        }
    }


}

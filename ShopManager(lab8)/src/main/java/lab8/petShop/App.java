package lab8.petShop;

import lab8.petShop.animal.Country;
import lab8.petShop.animal.bird.Rooster;
import lab8.petShop.animal.fish.Shark;
import lab8.petShop.animal.fish.Water;
import lab8.petShop.animal.reptile.Alligator;
import lab8.petShop.manager.ShopManager;
import lab8.petShop.manager.SortOrder;

public class App {
    public static void main(final String...args) {
        ShopManager newManager = new ShopManager();
        Shark blueShark = new Shark(100,200, Country.US,true,300, Water.SEA_WATER,
                true);
        Rooster redRooster = new Rooster(111,222, Country.UKRAINE,false,333,
                444,false,true,true);
        Alligator greenAlligator = new Alligator(11,22, Country.CHINA,true,33,
                44,true);

        newManager.addAnimal(blueShark);
        newManager.addAnimal(redRooster);
        newManager.addAnimal(greenAlligator);
        System.out.println(newManager.getAnimals());

        newManager.sortByPrice(SortOrder.ASC);
        System.out.println("Sorted by price:");
        System.out.println(newManager.getAnimals());

        newManager.sortByEatsInGrams(SortOrder.DES);
        System.out.println("Sorted by EatsInGrams:");
        System.out.println(newManager.getAnimals());

        newManager.sortByWeightInGrams(SortOrder.ASC);
        System.out.println("Sorted by WeightInGrams:");
        System.out.println(newManager.getAnimals());
    }

}

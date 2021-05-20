package lab8.petShop.animal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Animal {
    public int weightInGrams;
    public int price;
    public Country originCountry;
    public boolean isPredator;
    public int eatsInGrams;

    public Animal(final int weightInGrams,
                  final int price,
                  final Country originCountry,
                  final boolean isPredator,
                  final int eatsInGrams) {
        this.weightInGrams = weightInGrams;
        this.price = price;
        this.originCountry = originCountry;
        this.isPredator = isPredator;
        this.eatsInGrams = eatsInGrams;
    }
}

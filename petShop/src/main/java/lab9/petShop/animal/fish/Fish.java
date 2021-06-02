package lab9.petShop.animal.fish;

import lab9.petShop.animal.Animal;
import lab9.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Fish extends Animal {
    public Water typeOfWater;

    public Fish(final int weightInGrams,
                final int price,
                final Country originCountry,
                final boolean isPredator,
                final int eatsInGrams,
                final Water typeOfWater) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams);
        this.typeOfWater = typeOfWater;
    }
}

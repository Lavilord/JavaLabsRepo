package lab9.petShop.animal.reptile;

import lab9.petShop.animal.Animal;
import lab9.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Reptile extends Animal {
    public int lengthInCentimeters;

    public Reptile(final int weightInGrams,
                   final int price,
                   final Country originCountry,
                   final boolean isPredator,
                   final int eatsInGrams,
                   final int lengthInCentimeters) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams);
        this.lengthInCentimeters = lengthInCentimeters;
    }
}

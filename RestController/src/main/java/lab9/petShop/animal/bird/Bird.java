package lab9.petShop.animal.bird;

import lab9.petShop.animal.Animal;
import lab9.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Bird extends Animal {
    public int lengthOfWingInCentimeters;
    public boolean canSpeak;

    public Bird(final int weightInGrams,
                final int price,
                final Country originCountry,
                final boolean isPredator,
                final int eatsInGrams,
                final int lengthOfWingInCentimeters,
                final boolean canSpeak) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams);
        this.lengthOfWingInCentimeters = lengthOfWingInCentimeters;
        this.canSpeak = canSpeak;
    }
}

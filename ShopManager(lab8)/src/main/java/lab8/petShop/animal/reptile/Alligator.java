package lab8.petShop.animal.reptile;

import lab8.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
final public class Alligator extends Reptile {
    public Boolean isTrained;

    public Alligator(final int weightInGrams,
                     final int price,
                     final Country originCountry,
                     final boolean isPredator,
                     final int eatsInGrams,
                     final int lengthInCentimeters,
                     final Boolean isTrained) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams, lengthInCentimeters);
        this.isTrained = isTrained;
    }

    @Override
    public String toString() {
        return "Alligator{"
                +
                "weightInGrams=" + weightInGrams
                +
                ", price=" + price
                +
                ", originCountry=" + originCountry
                +
                ", isPredator=" + isPredator
                +
                ", eatsInGrams=" + eatsInGrams
                +
                ", isTrained=" + isTrained
                +
                ", lengthInCentimeters=" + lengthInCentimeters
                +
                '}' + '\n';
    }
}

package lab9.petShop.animal.reptile;

import lab9.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
final public class Snake extends Reptile {
    public Boolean isPoisonous;

    public Snake(final int weightInGrams,
                 final int price,
                 final Country originCountry,
                 final boolean isPredator,
                 final int eatsInGrams,
                 final int lengthInCentimeters,
                 final Boolean isPoisonous) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams, lengthInCentimeters);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public String toString() {
        return "Snake{"
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
                ", lengthInCentimeters=" + lengthInCentimeters
                +
                ", isPoisonous=" + isPoisonous
                +
                '}' + '\n';
    }
}

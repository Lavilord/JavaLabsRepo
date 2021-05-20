package lab8.petShop.animal.fish;

import lab8.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
final public class Shark extends Fish {
    public Boolean isDangerousForHumans;

    public Shark(final int weightInGrams,
                 final int price,
                 final Country originCountry,
                 final boolean isPredator,
                 final int eatsInGrams,
                 final Water typeOfWater,
                 final Boolean isDangerousForHumans) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams, typeOfWater);
        this.isDangerousForHumans = isDangerousForHumans;
    }

    @Override
    public String toString() {
        return "Shark{"
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
                ", typeOfWater=" + typeOfWater
                +
                ", isDangerousForHumans=" + isDangerousForHumans
                +
                '}' + '\n';
    }
}

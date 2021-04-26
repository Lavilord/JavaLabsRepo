package lab8.petShop.animal.bird;

import lab8.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
final public class Parrot extends Bird {
    public  String color;

    public Parrot(final int weightInGrams,
                  final int price,
                  final Country originCountry,
                  final boolean isPredator,
                  final int eatsInGrams,
                  final int lengthOfWingInCentimeters,
                  final boolean canSpeak,
                  final String color) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams, lengthOfWingInCentimeters, canSpeak);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Parrot{"
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
                ", lengthOfWingInCentimeters=" + lengthOfWingInCentimeters
                +
                ", canSpeak=" + canSpeak
                +
                ", color='" + color + '\''
                +
                '}' + '\n';
    }
}

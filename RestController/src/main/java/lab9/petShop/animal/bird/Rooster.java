package lab9.petShop.animal.bird;

import lab9.petShop.animal.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
final public class Rooster extends Bird {
    public Boolean isFertile;
    public Boolean isAlarmClock;

    public Rooster(final int weightInGrams,
                   final int price,
                   final Country originCountry,
                   final boolean isPredator,
                   final int eatsInGrams,
                   final int lengthOfWingInCentimeters,
                   final boolean canSpeak,
                   final Boolean isFertile,
                   final Boolean isAlarmClock) {
        super(weightInGrams, price, originCountry, isPredator, eatsInGrams, lengthOfWingInCentimeters, canSpeak);
        this.isFertile = isFertile;
        this.isAlarmClock = isAlarmClock;
    }

    @Override
    public String toString() {
        return "Rooster{"
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
                ", isFertile=" + isFertile
                +
                ", isAlarmClock=" + isAlarmClock
                +
                '}' + '\n';
    }
}

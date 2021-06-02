package lab9.petShop.animal;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "mAnimal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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

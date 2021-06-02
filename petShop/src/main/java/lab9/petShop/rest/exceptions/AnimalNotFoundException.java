package lab9.petShop.rest.exceptions;

public class AnimalNotFoundException extends Exception {
    public AnimalNotFoundException(String message) {
        super(message);
    }
    public AnimalNotFoundException(){}
}

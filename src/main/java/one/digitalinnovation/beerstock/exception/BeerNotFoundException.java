package one.digitalinnovation.beerstock.exception;

public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String beerName) {
        super(String.format("Beer with name %s not found in the system.", beerName));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Beer with id %s not found in the system.", id));
    }
}

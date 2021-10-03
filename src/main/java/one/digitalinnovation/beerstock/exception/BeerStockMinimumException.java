package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockMinimumException extends Exception {

    public BeerStockMinimumException(Long id, int quantityToDecrement) {
        super(String.format("The beer informed with ID %s to decrement %s, exceeds the minimum stock capacity.", id, quantityToDecrement));
    }
}

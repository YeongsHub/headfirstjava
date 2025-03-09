package ordercoffee;

import java.util.*;
import java.util.stream.*;
public class CoffeeOrder {
    public static void main(String[] args){
        List<String> coffees = List.of("Cappuchino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuchino", "Flat White", "Lattee");
        List<String> coffeeEndingIn0 = coffees.stream()
                .sorted()
                .distinct()
                .filter(s -> s.endsWith("o"))
                .collect(Collectors.toList());

        System.out.println(coffeeEndingIn0);
    }
}

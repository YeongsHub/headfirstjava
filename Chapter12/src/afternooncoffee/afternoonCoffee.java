package afternooncoffee;
import java.util.*;
import java.util.stream.Collectors;

public class afternoonCoffee {
    public static void main(String[] args){
        List<String> coffees = List.of("Cappuchino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuchino", "Flat White", "Lattee");
        Optional<String> afternoonCoffee = coffees.stream()
                .map(Coffee::getName)
                .sorted()
                .findFirst()
                .collect(Collectors.toList());
        System.out.println(afternoonCoffee);
    }
}

import java.util.*;
public class PrintColors {
    public static void main(String[] args){
        List<String> allColors = List.of("red", "blue", "yellow");
//        for(String color : allColors ){
//            System.out.println(color);
//        }
        allColors.forEach(color -> System.out.println(color));
    }

}
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LimitWithStream {
    public static void main(String[] args){
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        List<String> Limit = strings.stream().limit(4).collect(Collectors.toList());
        List<String> result = strings.stream()
                               //         .sorted()
                                        .skip(2)
                                        .limit(4)
                                        .collect(Collectors.toList());
        //long result = limit.count();
        System.out.println("strings = " + strings );
        System.out.println("limit =" + Limit);
        System.out.println("Result =" + result);
    }

}

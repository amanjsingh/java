package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        String[] namesArray = {"Aman", "Jot", "Singh", "MACS", "Halifax", "Dalhousie"};

//        forEach
        Arrays.stream(namesArray).forEach(name -> System.out.println(name + " "));

//        min
        Optional<String> resultMin = Arrays.stream(namesArray).min((a, b) -> a.compareTo(b));
        System.out.println("Min - " + resultMin);

//        allMatch
        boolean isNotEmpty = Arrays.stream(namesArray).allMatch(name -> !name.isEmpty());
        System.out.println("All Match - Not Empty - " + isNotEmpty);

//        noneMatch
        boolean matchGurdaspur = Arrays.stream(namesArray).noneMatch(name -> name.equals("Gurdaspur"));
        System.out.println("None Match - Gurdaspur - " + matchGurdaspur);

//        anyMatch
        boolean matchJot = Arrays.stream(namesArray).anyMatch(name -> name.equals("Jot"));
        System.out.println("Any Match - Jot - " + matchJot);

//        collect
        List<String> namesGreaterThan5 = Arrays.stream(namesArray).filter(name -> name.length() > 5).collect(Collectors.toList());
        System.out.println(namesGreaterThan5);

//        reduce
        int[] intArray = {1, 2, 3, 4, 5};
        int total = Arrays.stream(intArray).reduce(0, (x, y) -> x + y);
        System.out.println(total);
    }
}

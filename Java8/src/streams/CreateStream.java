package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        String[] namesArray = {"Aman", "Jot", "Singh", "MACS", "Halifax", "Dalhousie"};
        List<String> namesList = new ArrayList<>(Arrays.asList(namesArray));

//        Create stream based on array
        Stream<String> arrayStream = Arrays.stream(namesArray);

//        Create stream based on collection
        Stream<String> listStream = namesList.stream();

//        Create stream using generate method
        Stream<Integer> generateStream = Stream.generate(() -> 5);  //Infinite stream of 5s

//        Create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2);
    }
}

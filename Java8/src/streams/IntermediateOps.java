package streams;

import java.util.Arrays;

public class IntermediateOps {
    public static void main(String[] args) {
        String[] names = {"Aman", "Jot", "Singh", "Arshdeep", "Singh"};
//        filter
        Arrays.stream(names).filter(s -> s.startsWith("A")).forEach(System.out::println);

//        map
        Arrays.stream(names).map(s -> s + " student").forEach(System.out::println);

//        flatmap
        String[][] names2D = {names, names};
        String[] names1D = Arrays.stream(names2D)
                .flatMap(arr -> Arrays.stream(arr))
                .toArray(size -> new String[size]);
        for(String name : names1D){
            System.out.println("1D "+name);
        }

//        peek - For debugging streams
        String[] namesPeek = Arrays.stream(names2D)
                .flatMap(arr -> Arrays.stream(arr))
                .peek(s -> System.out.println("Peek "+s))
                .toArray(size -> new String[size]);

        Arrays.stream(names1D).skip(1).forEach(s-> System.out.println("Skip "+s));
        Arrays.stream(names1D).limit(2).forEach(s-> System.out.println("Limit "+s));
    }
}
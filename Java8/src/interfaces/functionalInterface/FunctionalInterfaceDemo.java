package interfaces.functionalInterface;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        Anonymous Implementation
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };

        System.out.println(predicate.test("Amanjot"));
        System.out.println(predicate.test("Singh"));
    }
}

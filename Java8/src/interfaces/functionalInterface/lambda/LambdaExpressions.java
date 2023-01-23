package interfaces.functionalInterface.lambda;

public class LambdaExpressions {
    public static void main(String[] args) {
//        No Parameter
        Creator creator = () -> "Hello Hello!"; //End with a semicolon
        System.out.println(creator.create());

//        One Parameter
        Tester tester1 = str -> str.length() > 5;
        Tester tester2 = (str) -> str.startsWith("A");
        Tester tester3 = (String str) -> str.equals("Amanjot");
        Tester tester4 = (str) -> {
            return str.endsWith("t"); // Braces + return + semicolon
        }; //End with a semicolon
        System.out.println(tester1.test("Amanjot"));
        System.out.println(tester2.test("Amanjot"));
        System.out.println(tester3.test("Amanjot"));
        System.out.println(tester4.test("Amanjot"));

//        Multiple Parameters
        Calculator calculator1 = (a, b) -> a + b;
        Calculator calculator2 = (double a, double b) -> a + b;
        Calculator calculator3 = (double a, double b) -> {
            return a + b; // Braces + return + semicolon
        }; //End with a semicolon
        System.out.println(calculator1.calculate(1, 1));
        System.out.println(calculator2.calculate(2, 2));
        System.out.println(calculator3.calculate(3, 3));

//        Lambda as method argument
        System.out.println(runTester(s -> s.length()>5, "Amanjot"));
        System.out.println(runTester(s -> s.startsWith("Z"), "Amanjot"));
    }

    public static boolean runTester(Tester tester, String str){
        return tester.test(str);
    }
}

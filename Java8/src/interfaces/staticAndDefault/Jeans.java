package interfaces.staticAndDefault;

public class Jeans implements Foldable, Washable{
    public static void main(String[] args) {
        Foldable.printFoldInstruction();

        Jeans jeans = new Jeans();
        jeans.fold();
    }

    @Override
    public void fold() {
        System.out.println("Had to implement fold()");
        Foldable.super.fold();
        Washable.super.fold();
    }
}

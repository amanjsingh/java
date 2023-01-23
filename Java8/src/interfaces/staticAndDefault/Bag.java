package interfaces.staticAndDefault;

public class Bag implements Foldable{
    public static void main(String[] args) {
        Foldable.printFoldInstruction();

        Bag bag = new Bag();
        bag.fold();
    }
}

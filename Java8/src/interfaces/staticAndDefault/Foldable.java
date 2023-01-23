package interfaces.staticAndDefault;

public interface Foldable {
    static void printFoldInstruction(){
        System.out.println("Carefully fold the object");
    }

    default void fold(){
        System.out.println("Folding in progress!");
    }
}

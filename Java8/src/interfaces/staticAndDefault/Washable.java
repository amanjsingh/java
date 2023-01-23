package interfaces.staticAndDefault;

public interface Washable {
    default void fold(){
        System.out.println("Folding washed item!");
    }
}

package interfaces.staticAndDefault;

public class Item implements Foldable{
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void fold() {
        System.out.println("Ready to fold "+name);
        Foldable.super.fold();
    }

    public static void main(String[] args) {
        Foldable.printFoldInstruction();

        Item item = new Item("Shirt");
        item.fold();
    }
}

public class Shoppingrunner {
    public static void main(String[] args) {
        ShoppingListItem item = new ShoppingListItem("apple", 0.50, 10);
        ShoppingListItem item2 = new ShoppingListItem("banana", 0.75, 5);
        item.increaseQuantity(7);
        item2.increaseQuantity(4);
        double total = item.totalCost() + item2.totalCost();

    }
}

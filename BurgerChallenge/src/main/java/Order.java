import java.util.Scanner;

public class Order {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double totalPrice;
    public static int counter;

    public void newOrder(Scanner input) {
        burger = new Burger();
        burger.printBurgerMenuAndPick(input);
        burger.printAndPickExtras(input);
        totalPrice += burger.getPrice();

        drink = new Drink();
        drink.printAndPickDrink(input);
        totalPrice += drink.getPrice();

        sideItem = new SideItem();
        sideItem.printAndPickSideItem(input);
        totalPrice += sideItem.getPrice();
    }

    @Override
    public String toString() {
        return String.format("\nOrder №" + (++counter) + "\n{" +
                burger +
                "," + drink +
                "," + sideItem +
                "," + "\nTotal price: %.2f" +
                "}\n", totalPrice);
    }
}

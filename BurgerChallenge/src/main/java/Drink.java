import java.util.Scanner;

public class Drink {

    private String drinkName;
    private double price;

    public void printAndPickDrink(Scanner input) {
        if (isAddDrink(input)) {
            printDrinksMenu();
            if (input.hasNextInt(4)) {
                int choice = input.nextInt();
                addDrink(choice);
            }
        }
    }

    private boolean isAddDrink(Scanner input) {
        System.out.println("Would you like to add Drink?\nType 'y' to agree.");
        return input.next().equalsIgnoreCase("y");
    }

    private void addDrink(int choice) {
        if (choice == 1) {
            this.drinkName = "Cola";
            price += 0.35;
            System.out.println("Cola added");
        }
        if (choice == 2) {
            this.drinkName = "Fanta";
            price += 0.30;
            System.out.println("Fanta added");
        }
        if (choice == 3) {
            this.drinkName = "Sprite";
            price += 0.25;
            System.out.println("Sprite added");
        }
    }

    private void printDrinksMenu() {
        System.out.println("1. Cola | price: 0.35");
        System.out.println("2. Fanta | price: 0.30");
        System.out.println("3. Sprite | price: 0.25");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nDrink{" +
                "drinkName='" + drinkName + '\'' +
                ", price=" + price +
                "}";
    }
}

import java.util.Scanner;

public class Burger {

    private String type;
    private double price;
    private String extra1;
    private String extra2;
    private String extra3;

    public void printBurgerMenuAndPick(Scanner input) {
        printBurgerMenu();
        addBurger(input);
    }

    public void addBurger(Scanner input) {
        if (input.hasNextInt()) {
            switch (input.nextInt(4)) {
                case 1 -> {
                    System.out.println("Small burger added");
                    this.type = "Small burger";
                    this.price = 1.0;
                }
                case 2 -> {
                    System.out.println("Average burger added");
                    this.type = "Average burger";
                    this.price = 1.5;
                }
                case 3 -> {
                    System.out.println("Big burger added");
                    this.type = "Big burger";
                    this.price = 2.0;
                }
            }
        }
    }

    public static void printBurgerMenu() {
        System.out.println("1. Small burger | Price: 1.0\n2. Average burger | Price: 1.5\n3. Big burger | Price: 2.0");
    }

    private boolean isAddExtras(Scanner input) {
        System.out.println("Would you like to add extras?\nType 'y' to agree.");
        return input.next().equalsIgnoreCase("y");
    }

    public void printAndPickExtras(Scanner input) {
        if (isAddExtras(input)) {
            printExtrasMenu();
            if (input.hasNextInt(4)) {
                int choice = input.nextInt();
                addExtra(choice);
            }
        }
    }

    private void addExtra(int choice) {
        if (choice == 1) {
            this.extra1 = "Extra Ketchup";
            price += 0.05;
            System.out.println("Ketchup added");
        }
        if (choice == 2) {
            this.extra2 = "Extra Cucumber";
            price += 0.10;
            System.out.println("Cucumber added");
        }
        if (choice == 3) {
            this.extra3 = "Extra Tomato";
            price += 0.15;
            System.out.println("Tomato added");
        }
        if (choice <= 0 || choice > 3) {
            System.out.println("Mistake. No extra selected");
        }
    }

    private void printExtrasMenu() {
        System.out.println("1. Ketchup | price: 0.05");
        System.out.println("2. Cucumber | price: 0.10");
        System.out.println("3. Tomato | price: 0.15");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                ", extra3='" + extra3 + '\'' +
                ", price=" + price +
                "}";
    }
}

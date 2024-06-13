import java.util.Scanner;

public class Burger extends Order {

    private String type;
    private double price;
    private String extra1;
    private String extra2;
    private String extra3;


    public Burger() {
        this("Small burger", 1.0);
    }

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
        this.extra1 = "none";
        this.extra2 = "none";
        this.extra3 = "none";
    }

    public Burger(String type, double price, String extra1, String extra2, String extra3) {
        this.type = type;
        this.price = price;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public void printBurgerMenuAndPick(Scanner input) {
        burgerMenu();
        selectBurger(input);
    }

    public void selectBurger(Scanner input) {

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

    public static void burgerMenu() {
        System.out.println("1. Small burger | Price: 1.0\n2. Average burger | Price: 1.5\n3. Big burger | Price: 2.0");
    }

    public boolean isAddExtras(Scanner input) {
        System.out.println("Would you like to add extras?\nType 'y' to agree.");
        return input.next().equalsIgnoreCase("y");
    }

    public void printAndPickExtras(Scanner input) {
        if (isAddExtras(input)) {
            printExtrasMenu();
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                addExtra(choice);
            }
        }
    }

    public void addExtra(int choice) {
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

    public void printExtrasMenu() {
        System.out.println("1. Ketchup | price: 0.05");
        System.out.println("2. Cucumber | price: 0.10");
        System.out.println("3. Tomato | price: 0.15");
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getExtra1() {
        return extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                ", extra3='" + extra3 + '\'' +
                "} " + super.toString();
    }
}

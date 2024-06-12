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

    public Burger selectBurger(int type) {
        switch (type) {
            case 1 -> {
                if (isAddExtras()) {
                    printExtrasMenu();
                    try (Scanner input = new Scanner(System.in)) {
                        if (input.hasNextInt()) {
                            addExtra(input.nextInt());
                            return new Burger("Small burger", price + 1.0, extra1, extra2, extra3);
                        }
                    }
                }
                return new Burger("Small burger", 1.0);
            }
            case 2 -> {
                return new Burger("Average burger", 1.5);
            }
            case 3 -> {
                return new Burger("Big burger", 2.0);
            }
        }
        return new Burger();
    }

    public static void burgerMenu() {
        System.out.println("1. Small burger\n2. Average burger\n3. Big burger");
    }

    public boolean isAddExtras() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Would you like to add extras?");

            return input.nextLine().equalsIgnoreCase("y");
        }
    }

    public void addExtra(int choice) {
        if (choice == 1) {
            this.extra1 = "Extra Ketchup";
            price += 0.05;
        }
        if (choice == 2) {
            this.extra2 = "Extra Cucumber";
            price += 0.10;
        }
        if (choice == 3) {
            this.extra3 = "Extra Tomato";
            price += 0.15;
        }
    }

    public void printExtrasMenu() {
        System.out.println("1. Ketchup | price: 0.05");
        System.out.println("2. Cucumber | price: 0.10");
        System.out.println("1. Tomato | price: 0.15");
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

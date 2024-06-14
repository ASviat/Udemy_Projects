import java.util.Scanner;

public class SideItem {

    private String sideItemName;
    private double price;

    public void printAndPickSideItem(Scanner input) {
        if (isAddSideItem(input)) {
            printSideItemsMenu();
            if (input.hasNextInt(4)) {
                int choice = input.nextInt();
                addSideItem(choice);
            }
        }
    }

    public boolean isAddSideItem(Scanner input) {
        System.out.println("Would you like to add Side Item?\nType 'y' to agree.");
        return input.next().equalsIgnoreCase("y");
    }

    public void addSideItem(int choice) {
        if (choice == 1) {
            this.sideItemName = "Fries";
            price += 0.45;
            System.out.println("Fries added");
        }
        if (choice == 2) {
            this.sideItemName = "Shrimps";
            price += 1.20;
            System.out.println("Shrimps added");
        }
        if (choice == 3) {
            this.sideItemName = "Onion rings";
            price += 0.85;
            System.out.println("Onion rings added");
        }
    }

    public void printSideItemsMenu() {
        System.out.println("1. Fries | price: 0.45");
        System.out.println("2. Shrimps | price: 1.20");
        System.out.println("3. Onion rings | price: 0.85");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nSideItem{" +
                "sideItemName='" + sideItemName + '\'' +
                ", price=" + price +
                '}';
    }
}

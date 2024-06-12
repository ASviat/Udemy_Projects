import java.util.Scanner;

public class Order {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    private void orderMainMenu() {
        System.out.println("Pick food you'd like to get:");
        System.out.println("1. Burger\n2. Drink\n3. Side item\n\n0. Exit");
    }

    public void dishSelection() {


        try (Scanner input = new Scanner(System.in)) {
            orderMainMenu();
            if (input.hasNextInt()) {

                switch (input.nextInt()) {
                    case 0 -> System.out.println("Good bye");
                    case 1 -> {

                    }
                    case 2 -> System.out.println();
                }
            } else {
                System.out.println("Enter number, pls");
                input.nextLine();
                dishSelection();
            }

        } catch (Exception e) {
            System.out.println("Mistake");
            dishSelection();
        }


    }
}

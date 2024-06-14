import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static final List<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our restaurant!");
        String choice = "";
        int index = 0;
        while (!choice.equalsIgnoreCase("q")) {
            System.out.println("Make a new order?\nPress:\ny to agree\nq to quit and print all orders");
            choice = input.next();
            if (choice.equalsIgnoreCase("y")) {
                orders.add(new Order());
                orders.get(index++).newOrder(input);
            } else if (choice.equalsIgnoreCase("q")) {
                System.out.println("Good bye");
                break;
            }
        }
        System.out.println(orders);

        input.close();
    }
}

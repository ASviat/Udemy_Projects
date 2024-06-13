import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {


    private static Queue<Order> orders = new LinkedList<>();

    public static void main(String[] args) {

        Order order = new Order();
        Burger burger = new Burger();
        Scanner input = new Scanner(System.in);

        burger.printBurgerMenuAndPick(input);
        System.out.println("Burger done.");
        burger.printAndPickExtras(input);
        System.out.println(burger);
        input.close();



    }

}

import java.util.Queue;

public class Program {


    private static Queue<Order> orders;

    public static void main(String[] args) {
        Order order = new Order();
        order.setBurger(new Burger());
        Burger.burgerMenu();


    }


}

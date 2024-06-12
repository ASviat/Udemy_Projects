public class Order {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public static void orderMainMenu() {
        System.out.println("Pick food you'd like to get:");
        System.out.println("1. Burger\n2. Drink\n3. Side item\n\n0. Exit\n");
    }

    public Order() {
    }

    public Order(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public void addOrder(){

    }
}

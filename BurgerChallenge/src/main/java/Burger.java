public class Burger {

    private String type;
    private double price;
    private String extra1;
    private String extra2;
    private String extra3;

    private Burger() {
        this.type = "Small burger";
        this.price = 1.0;
    }

    private Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    private Burger(String type, double price, String extra1, String extra2, String extra3) {
        this.type = type;
        this.price = price;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Burger selectBurger(int type) {
        switch (type) {
            case 1 -> {
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

    public void BurgerMenu() {
        System.out.println("1. Small burger\n2. Average burger\n3. Big burger");
    }
}

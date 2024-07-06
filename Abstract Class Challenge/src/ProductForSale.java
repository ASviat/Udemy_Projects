abstract class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public OrderItem makeOrder(int quantity) {
        return new OrderItem(quantity, this);
    }

    public void printOrderedProduct(int quantity) {
        System.out.printf("|Product:%11s\n|Quantity:%10s", type, quantity);
        System.out.printf("\n|Price:" + " %11.2f$\n", getPrice(quantity));
        System.out.println("_".repeat(20));
    }

    protected double getPrice(int quantity) {
        return price * quantity;
    }

    protected String getType() {
        return type;
    }

    protected double getPrice() {
        return price;
    }

    protected String getDescription() {
        return description;
    }

    abstract void showDetails();
}

class Pillow extends ProductForSale {

    public Pillow(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        String[] n = getDescription().split("\n");
        int lastLineChars = n[n.length - 1].length();

        System.out.println("\t" + super.getType());
        System.out.println("\n" + super.getDescription());
        System.out.println("\n\tCost: " + super.getPrice() + "$");
        System.out.println("_".repeat(lastLineChars));
    }
}

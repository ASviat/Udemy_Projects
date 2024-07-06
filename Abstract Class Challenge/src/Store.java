import java.util.ArrayList;
import java.util.LinkedList;

record OrderItem(int quantity, ProductForSale selectedProduct) {
    public OrderItem(ProductForSale selectedProduct) {
        this(1, selectedProduct);
    }

    public void printOrder() {
        selectedProduct.printOrderedProduct(quantity);
    }
}

class Store {

    private static final ArrayList<ProductForSale> store = new ArrayList<>();
    private static final LinkedList<OrderItem> orders = new LinkedList<>();

    public static void main(String[] args) {

        Pillow pillow = new Pillow("Pillow", 25.5, """
                * Luxury Plush Material: The luxury fiber pillows are crafted in super plush microfiber ! They are expertly tailored to ensure maximum comfort for all sleeping positions.The pillow top covers are made of High-quality Microfiber fabric material. It's soft and cooling.
                * Fluffy & Support: Filled with 100% microfiber similar to down which makes the pillows supportive and cozy. Whether you prefer soft or firm pillows, our comfortable cooling pillows are for you. 800 GSM Filling makes pillows extremely fluffy.Our 2 pack bed pillows provide a great balance of supple softness and plump firmness. They will give you great support for your neck and shoulder,they are suitable for side, stomach, and back sleepers.
                * NO-SHIFT Construction: With no-shift construction, you'll have a comfortable sleep experience throughout the night. You’ll fall asleep fast and sleep like on a cloud. It is highly recommended as a best pillows for your parents, family and friends. They give superior comfort against your skin without extra heat and sweat all night.
                * Easy to care: Our queen pillows come vacuum-sealed for shipping, once opened it will start to fluff up. Please leave 24 hours for the pillows to get to full thickness before using them. Our Pillows are machine washable with tumble dry low. Please do not iron or dry clean.
                * High Quality: Buy with confidence! We are convinced our high quality fluffy pillows will exceed your expectations. Complete customer satisfaction is our top priority. You can choose to exchange for a new pair or a full refund, we will spare no effort to assist you to solve any problem!""");

        IPhone iPhone = new IPhone("IPhone", 1500, """
                * 6.1" Super Retina XDR display with ProMotion. 5G Superfast downloads, high?quality streaming
                * Cinematic mode in 1080p at 30 fps. Dolby Vision HDR video recording up to 4K at 60 fps. 6X Optical zoom range
                * A15 Bionic chip. New 6-core CPU with 2 performance and 4 efficiency cores. New 5-core GPU. New 16-core Neural Engine
                * Up to 22 hours video playback. Face ID. Ceramic Shield front. Surgical-grade stainless steel
                * Water resistant to a depth of 6 meters for up to 30 minutes. Compatible with MagSafe accessories and wireless chargers
                """);

        Pen pen = new Pen("Pen", 50, """              
                * Glossy Black finish with a retro touch inspires original ideas
                * Experience the streamlined style and clean lines of the iconic Parker Jotter design
                * Signature retractable design opens with a satisfying click
                * Ultra resistant scratch-free plastic body
                * Fitted with Quinkflow Ballpoint refill for optimal ink flow and a smooth writing experience; medium point; also works with Parker gel refills
                """);

        store.add(pillow);
        store.add(iPhone);
        store.add(pen);

        orders.add(pillow.makeOrder(2));
        orders.add(iPhone.makeOrder(4));
        orders.add(pen.makeOrder(3));
        orders.add(new OrderItem(pillow));

        printStore();

        printOrders();
    }

    public static void printStore() {
        for (var i : store) {
            i.showDetails();
        }
    }

    public static void printOrders() {
        double salesTotal = 0;
        int counter = 1;
        for (var i : orders) {
            salesTotal += i.selectedProduct().getPrice(i.quantity());
            System.out.println("|Order №" + counter++);
            i.printOrder();
        }
        System.out.printf("Total price: %8.2f$", salesTotal);
    }
}

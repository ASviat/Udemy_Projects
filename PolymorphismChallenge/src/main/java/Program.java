public class Program {
    /*
    At least one method should print the type of the runtime object.

     */
    public static void main(String[] args) {
        Car c1 = new HybridCar("Honda", 5.0, 20000, 4);
        c1.startEngine();
        Object c2 = new HybridCar("BMW i5", 6, 15000, 4);
        System.out.println(c1);
        System.out.println(c2.getClass());
    }
}

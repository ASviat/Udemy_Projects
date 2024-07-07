public class Bird extends Animal implements Trackable{
    @Override
    void move() {
        System.out.println("Bird moving");
    }

    @Override
    public void track() {
        System.out.println("Bird tracked");
    }
}

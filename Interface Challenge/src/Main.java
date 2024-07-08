public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Trackable bird2 = new Bird();
        bird.move();
        bird.track();
        bird2.track();
        bird2.printInfo();
        Trackable cat = new Cat();
        cat.printInfo();

        Vehicle.CAR.printInfo();
        Trackable.printPrivate();




    }
}

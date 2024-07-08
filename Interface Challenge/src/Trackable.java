interface Trackable {

    double COORDINATES = 1.05;

    void track();

    default void printInfo() {
        System.out.println("Works");
    }

    private static void privateConcrete() {
        System.out.println(COORDINATES);
    }

    static void printPrivate(){
        privateConcrete();
    }
    private void printPrivateNonStatic(){
        privateConcrete();
    }
}

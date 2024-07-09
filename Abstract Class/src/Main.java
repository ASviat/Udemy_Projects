public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(7);

        node1.setNext(node2);
        System.out.println(node1.next());
        System.out.println("-".repeat(20));

        node2.setPrevious(node1);
        System.out.println(node2.previous());


    }
}

import java.util.*;

public class Main {

    private static final Scanner console = new Scanner(System.in);
    private static final LinkedList<Place> townList = new LinkedList<>();

    record Place(String name, int distance) {
        @Override
        public String toString() {
            return String.format("Place = %s", name).concat(String.format(" | Distance = %s", distance));
        }
    }

    public static void main(String[] args) {
        townList.add(new Place("Adelaide", 1374));
        townList.add(new Place("Alice Springs", 2771));
        townList.add(new Place("Brisbane", 917));
        townList.add(new Place("Darwin", 3972));
        townList.add(new Place("Melbourne", 877));
        townList.add(new Place("Perth", 3923));

        var iterator = townList.listIterator();
        String choice;
        do {
            printMenu();
            choice = menuChoice();
            switch (choice) {
                case "f" -> System.out.println(iterator.next());
                case "b" -> System.out.println(iterator.previous());
                case "l" -> printPlaces();
                case "s" -> {
                    sort();
                    printPlaces();
                }
                case "a" -> {
                    addPlace(new Place("Aroraar", 456));
                    printPlaces();
                }
                case "q" -> System.out.println("Good bye");
                default -> System.out.println("Some problems with choice");
            }
        }
        while (iterator.hasNext() && !choice.equalsIgnoreCase("q"));


        console.close();
    }

    public static void printMenu() {
        String text = """
                \nAvailable actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (S)ort places by distance
                (A)dd Place
                (Q)uit
                """;
        System.out.println(text);
    }

    public static String menuChoice() {
        String choice = console.nextLine().substring(0, 1);
        return choice.equalsIgnoreCase("f") ? "f"
                : choice.equalsIgnoreCase("b") ? "b"
                : choice.equalsIgnoreCase("l") ? "l"
                : choice.equalsIgnoreCase("s") ? "s"
                : choice.equalsIgnoreCase("a") ? "a"
                : choice.equalsIgnoreCase("q") ? "q"
                : "null";
    }

    public static void printPlaces() {
        for (Place town : townList) {
            System.out.println(town);
        }
    }

    public static void sort() {
        Place copy = null;
        int counter = townList.size() - 1;
        while (counter != 0) {
            for (int i = 1; i < townList.size(); i++) {
                if (townList.get(i - 1).distance > townList.get(i).distance) {
                    copy = townList.get(i - 1);
                    townList.set(i - 1, townList.get(i));
                    townList.set(i, copy);
                }
            }
            counter--;
        }
    }

    public static void addPlace(Place newPlace) {
        if (townList.contains(newPlace)) {
            System.out.println("New Place is already in the list");
        } else {
            townList.add(newPlace);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> myList = new ArrayList<>(List.of(
                new Player("Oleg"),
                new Player("Alex"),
                new Player("Vasya"),
                new Player("Fedya")
        ));

        for (var player : myList) {
            System.out.println(player);
        }

        System.out.println();
        myList.sort(new Player.PlayerComparator());
        for (var player : myList) {
            System.out.println(player);
        }

        System.out.println();
        myList.sort(new Player.PlayerComparator("yearOfBirth"));
        for (var player : myList) {
            System.out.println(player);
        }

        System.out.println();
        myList.sort(new Player.PlayerComparator("yearOfBirth").reversed());
        for (var player : myList) {
            System.out.println(player);
        }

        System.out.println();
        Collections.sort(myList);
        for (var player : myList) {
            System.out.println(player);
        }

    }
}

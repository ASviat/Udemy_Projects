import java.util.Comparator;
import java.util.Random;

public class Player implements Comparable<Player> {
    @Override
    public int compareTo(Player o) {
        return name.compareTo(o.name);
    }

    public static class PlayerComparator implements Comparator<Player> {

        private String fieldToCompare;

        public PlayerComparator() {
            this("id");
        }

        public PlayerComparator(String fieldToCompare) {
            this.fieldToCompare = fieldToCompare;
        }

        @Override
        public int compare(Player o1, Player o2) {
            if (fieldToCompare.equalsIgnoreCase("yearOfBirth")) {
                return Integer.compare(o1.yearOfBirth, o2.yearOfBirth);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }

    private int id;
    private String name;
    private int yearOfBirth;
    private Random random = new Random();

    public Player(String name) {
        this.id = random.nextInt(1000, 10000);
        this.name = name;
        this.yearOfBirth = random.nextInt(1980, 2006);
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(id, name, yearOfBirth);
    }
}

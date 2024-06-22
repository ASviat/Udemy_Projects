import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceryList = new ArrayList<>(Arrays.asList("Cucumber", "Potato", "Onion"));
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
        int choice;
        do {
            System.out.println("Available actions:\n" +
                    "\n" +
                    "        0 - to shutdown\n" +
                    "\n" +
                    "        1 - to add item(s) to list (comma delimited list)\n" +
                    "\n" +
                    "        2 - to remove any items (comma delimited list)\n" +
                    "\n" +
                    "        Enter a number for which action you want to do:");

            choice = scanner.nextInt(3);
            switch (choice) {
                case 0 -> System.out.println("Good Bye");
                case 1 -> {
                    System.out.println(groceryList);
                    addItem(groceryList);
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                }
                case 2 -> {
                    System.out.println(groceryList);
                    enterIndexAndRemoveItem(groceryList);
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                }
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void addItem(List<String> groceryList) {
        System.out.println("Enter comma delimited list to add: ");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim();
        List<String> addList = Arrays.asList(input.split(", "));

        if (isCopyInNewList(groceryList, addList)) {
            nullCopiesInNewList(groceryList, addList);
            for (int i = 0; i < addList.size(); i++) {
                if (!addList.get(i).equalsIgnoreCase("null")) {
                    groceryList.add(addList.get(i));
                }
            }
        }
    }

    private static boolean isCopyInNewList(List<String> groceryList, List<String> addList) {
        for (int i = 0; i < groceryList.size(); i++) {
            for (int j = 0; j < addList.size(); j++) {
                if (groceryList.get(i).equalsIgnoreCase(addList.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void nullCopiesInNewList(List<String> groceryList, List<String> addList) {
        for (int i = 0; i < groceryList.size(); i++) {
            for (int j = 0; j < addList.size(); j++) {
                if (groceryList.get(i).equalsIgnoreCase(addList.get(j))) {
                    addList.set(j, "null");
                }
            }
        }
    }

    private static void enterIndexAndRemoveItem(List<String> groceryList) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter index you'd like to remove");
        groceryList.remove(console.nextInt());
    }
}
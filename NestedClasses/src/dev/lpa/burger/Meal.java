package dev.lpa.burger;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1, "");
    }

    public Meal(double conversionRate, String toppings) {
        this.conversionRate = conversionRate;
        burger = new Burger("Big Tasty", toppings);
        drink = new Item("coke", "drink", 1.5);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = price + burger.totalToppingsPrice + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    private class Burger {

        private String burgerName;
        private List<Item> selectedToppings = new ArrayList<>();
        private double totalToppingsPrice;

        public Burger(String burgerName, String toppings) {
            this.burgerName = burgerName;
            stringToListOfItems(toppings);
            getTotalToppingsPrice();
        }

        private void stringToListOfItems(String toppingNames) {
            String[] listOfStrings = toppingNames.split(", ");
            for (var i : listOfStrings) {
                selectedToppings.add(addToppingsFromString(i));
            }
        }

        private Item addToppingsFromString(String toppingName) {
            return switch (toppingName.toUpperCase()) {
                case "TOMATO" -> new Item("Tomato", "Topping", 0.25);
                case "CUCUMBER" -> new Item("Cucumber", "Topping", 0.15);
                case "SALAM" -> new Item("Salam", "Topping", 0.45);
                default -> new Item();
            };
        }

        private void getTotalToppingsPrice() {
            for (var i : selectedToppings) {
                this.totalToppingsPrice += i.price;
            }
        }

        private String printToppingNames() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < selectedToppings.size(); i++) {
                sb.append("     Extra №%d %11s $%-15.2f%n".formatted(i + 1, selectedToppings.get(i).name, selectedToppings.get(i).price));
            }

            return sb.toString();
        }

        @Override
        public String toString() {
            return "%10s                $%.2f%n%15s".formatted(burgerName,price, printToppingNames());
        }
    }

    private class Item {

        private String name;
        private String type;
        private double price;

        public Item() {
        }

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f%n".formatted(type, name,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }

}

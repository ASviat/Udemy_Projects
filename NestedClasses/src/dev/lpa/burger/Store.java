package dev.lpa.burger;

public class Store {
    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);

        Meal myMeal = new Meal(1, "Cucumber, Salam, Tomato");
        System.out.println(myMeal);

        Meal myMeal2 = new Meal(0.78, "Salam, Salam, Tomato");
        System.out.println(myMeal2);
    }
}

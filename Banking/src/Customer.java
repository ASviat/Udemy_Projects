import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double transaction) {
        this.name = name;
        addTransaction(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (findCustomer(customerName) != null) {
            var customer = findCustomer(customerName);
            if (customer != null) {
                customer.addTransaction(transaction);
            }
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equalsIgnoreCase(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }
}

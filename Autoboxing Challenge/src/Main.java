import java.util.ArrayList;

public class Main {
    record Customer(String name, ArrayList<Double> transactions) {
    }

    record Bank(String name, ArrayList<Customer> customers) {
        private void addCustomer(String newCustomerName) {
            for (Customer i : customers) {
                if (i.name.equalsIgnoreCase(newCustomerName)) {
                    System.out.println("Customer with name " + newCustomerName + " already exists");
                    return;
                }
            }
            customers.add(new Customer(newCustomerName, new ArrayList<>()));
        }

        private void addTransaction(Customer customer, double transaction) {
            customer.transactions.add(transaction);
        }

        private void printCustomerTransactions(Customer customer) {
            System.out.println(customer.transactions);
        }
    }

    public static void main(String[] args) {

        Customer customer1 = new Customer("Sandy", new ArrayList<>());
        customer1.transactions.add(20.);
        System.out.println(customer1);

        Bank bank1 = new Bank("Kommerz", new ArrayList<>());
        bank1.customers.add(customer1);

        bank1.addCustomer("Sandy");
        System.out.println(bank1);

        bank1.addTransaction(bank1.customers.get(0), -10.);
        System.out.println(bank1);

        bank1.printCustomerTransactions(bank1.customers.get(0));
    }
}

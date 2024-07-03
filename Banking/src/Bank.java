import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {

        if (findBranch(branchName) != null) {
            var b = findBranch(branchName);
            for (var i : b.getCustomers()) {
                if (i.getName().equalsIgnoreCase(customerName)) {
                    return false;
                }
            }
            b.newCustomer(customerName, initialTransaction);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            var b = findBranch(branchName);
            if (b != null) {
                for (var i : b.getCustomers()) {
                    if (i.getName().equalsIgnoreCase(customerName)) {
                        b.addCustomerTransaction(customerName, transaction);
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }


    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equalsIgnoreCase(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null && printTransactions) {
            var b = findBranch(branchName);
            System.out.println("Customer details for branch " + b.getName());
            for (int i = 0; i < b.getCustomers().size(); i++) {
                System.out.println("Customer: " + b.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j < b.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.printf("[%d] Amount %.2f".indent(8), j + 1, b.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        }
        if (findBranch(branchName) != null && !printTransactions) {
            var b = findBranch(branchName);
            System.out.println("Customer details for branch " + b.getName());
            for (int i = 0; i < b.getCustomers().size(); i++) {
                System.out.println("Customer: " + b.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
            return true;
        }
        return false;
    }
}

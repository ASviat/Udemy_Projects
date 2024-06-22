import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("Alex", new ArrayList<>(Arrays.asList(
                Contact.createContact("Nastya", "+651"),
                Contact.createContact("Fedya", "+9874"),
                Contact.createContact("Sonya", "+123"))));
        System.out.println();
        System.out.println(mobilePhone.addNewContact(Contact.createContact("Nostya", "+841"))); //ok
        mobilePhone.printContacts();
        System.out.println(mobilePhone.findContact("Sonya"));
    }
}

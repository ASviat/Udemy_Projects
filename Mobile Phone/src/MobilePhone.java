import java.util.Arrays;
import java.util.List;

//    Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
//
//            -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
//
//    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
public class MobilePhone {


    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = Arrays.asList(Contact.createContact("Mother", "+11111"),
                Contact.createContact("Father", "00000000"));
    }

    public boolean addNewContact(Contact contact) {
        for (var line : myContacts) {
            return !line.getName().equalsIgnoreCase(contact.getName());
        }
        //            -  addNewContact(), has one parameter of type Contact and returns a boolean.
//    Returns true if the contact doesn't exists, or false if the contact already exists.
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (!addNewContact(newContact)) {
            oldContact = newContact;
            return true;
        } else {
            return false;
        }
//    -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact)
//    and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
    }

    public boolean removeContact(Contact contact) {
        if (!addNewContact(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;

        }
//            -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists
//    and was removed successfully, or false if the contact doesn't exists.
    }

    public int findContact(Contact contact) {

        return addNewContact(contact) ? myContacts.indexOf(contact) : -1;

//            -  findContact(), has one parameter of type Contact and returns an int. The returned value is
//        it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//
    }

    public int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(contact)) {
                return i;
            }
        }
        return -1;
//        return addNewContact(contact)?myContacts.;
//            -  findContact(), same as above, only it has one parameter of type String.
    }

    public Contact queryContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(contact)) {
                return myContacts.get(i);
            }
        }
        return null;
//            -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the
//    name and then return the Contact. Return null otherwise.
    }

    public void printContacts() {
        int counter = 1;
        System.out.println("Contact list:");
        for (var line : myContacts) {
            System.out.printf("%10d. %s -> %s\n", counter++, line.getName(), line.getPhoneNumber());

        }

    }
}
//        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
//
//    Contact List:
//            1. Bob -> 31415926
//            2. Alice -> 16180339
//            3. Tom -> 11235813
//            4. Jane -> 23571113

//
//            -  And seven methods, they are (their functions are in their names):
//
//
//

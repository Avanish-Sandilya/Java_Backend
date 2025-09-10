import java.util.ArrayList;

public class MobilePhone {
    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact)) {
            System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = myContacts.indexOf(oldContact);
        if (index < 0) {
            System.out.println("Contact not found");
            return false;
        }
        if (findContact(newContact)) {
            System.out.println("Contact with new details already exists");
            return false;
        }
        myContacts.set(index, newContact);
        System.out.println("Contact updated");
        return true;
    }

    public void removeContact(Contact contact) {
        if (myContacts.remove(contact)) {

            System.out.println("Removal successful");

        } else {
            System.out.println("No such contact exists");
        }
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean findContact(Contact contact) {
        return myContacts.contains(contact);
    }

    public void printContacts() {
        if (myContacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i));
        }
    }
}

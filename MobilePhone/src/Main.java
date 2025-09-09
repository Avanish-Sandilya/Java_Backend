public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123-456-7890");

        // Create contacts
        Contact john = Contact.createContact("John", "11111");
        Contact mary = Contact.createContact("Mary", "22222");
        Contact alex = Contact.createContact("Alex", "33333");
        Contact jane = Contact.createContact("Jane", "44444");

        // Add contacts
        phone.addNewContact(john);
        phone.addNewContact(mary);
        phone.addNewContact(alex);
        phone.addNewContact(jane);

        System.out.println("\n--- Contact List After Adding ---");
        phone.printContacts();

        // Try adding duplicate
        System.out.println("\n--- Adding duplicate contact ---");
        phone.addNewContact(Contact.createContact("John", "11111"));

        // Update contact
        System.out.println("\n--- Updating Contact ---");
        Contact updatedMary = Contact.createContact("Mary", "99999");
        phone.updateContact(mary, updatedMary);

        System.out.println("\n--- Contact List After Update ---");
        phone.printContacts();

        // Remove contact
        System.out.println("\n--- Removing Contact ---");
        phone.removeContact(alex);

        System.out.println("\n--- Contact List After Removal ---");
        phone.printContacts();

        // Find contact by name
        System.out.println("\n--- Finding Contact ---");
        int position = phone.findContact("Jane");
        if (position >= 0) {
            System.out.println("Found Jane at position " + (position + 1));
        } else {
            System.out.println("Jane not found");
        }

        // Test findContact(Contact)
        System.out.println("\n--- Checking if John exists ---");
        System.out.println(phone.findContact(john) ? "John exists" : "John not found");
    }
}

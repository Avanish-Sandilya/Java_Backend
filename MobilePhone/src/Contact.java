import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Factory method (optional)
    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }

    @Override
    public String toString() {
        return name + " -> " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return name.equalsIgnoreCase(c.name) && phoneNumber.equals(c.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), phoneNumber);
    }
}

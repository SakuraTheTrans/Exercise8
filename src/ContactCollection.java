import java.util.ArrayList;

public class ContactCollection {
    private ArrayList<ContactInfo> contacts = new ArrayList<>();

    public ArrayList<ContactInfo> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<ContactInfo> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ContactCollection{" +
                "contacts=" + contacts +
                '}';
    }

    public void addContact(ContactInfo contact) {
        contacts.add(contact);
    }

    public void listContacts() {
        for (ContactInfo contact : this.contacts) {
            System.out.println(contact.displayContact());
        }
    }
}

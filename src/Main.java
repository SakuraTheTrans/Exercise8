public class Main {
    public static void main(String[] args) {

        ContactInfo person1 = new ContactInfo("Sakura", "sakurathetrans@gmail.com");
        BusinessContactInfo person2 = new BusinessContactInfo("Astra", "astracreatesthings@gmail.com","614-789-2234");

        System.out.println(person1.displayContact());
        System.out.println(person2.displayContact());

        System.out.println("///////////////////////////////////////////////////\n");

        ContactCollection contactList = new ContactCollection();
        contactList.addContact(person1);
        contactList.addContact(person2);
        contactList.listContacts();

    }
}
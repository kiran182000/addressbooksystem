import java.util.ArrayList;
public class addressbooksystem {
    private ArrayList<Contact> contacts;
    public addressbooksystem() {
        contacts = new ArrayList<>();
    }
    public void addContact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contacts.add(newContact);
    }
    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    public static void main(String[] args) {
        addressbooksystem addressBook = new addressbooksystem();
        addressBook.addContact("Kiran", "R", "18/6", "Bangalore", "Karnataka", "560091", "123654", "hshjh");
        addressBook.printContacts();
    }
}
class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip: " + zip + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}


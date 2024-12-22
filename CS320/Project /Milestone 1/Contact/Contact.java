/*************************
 * Name: 	Shahbaj Singh 
 * Course: 	CS-320 
 * Date: 	November 14, 2024
 * Description: This is the contact class. It creates and stores contact information.
 *************************/

package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
    private final String contactID;
    private String firstName;
    private String lastName;
    private String number;
    private String address;
    private static AtomicLong idGenerator = new AtomicLong();

    // CONSTRUCTOR
    /*
     * The constructor initializes the contact by taking the
     * first name, last name, phone number, and address as parameters,
     * generating a new ID for the contactID field.
     * The first and last names are checked for null or blank values,
     * and if such conditions exist, they are set to "NULL" as a placeholder to
     * ensure data integrity;
     * if these names exceed 10 characters, they are truncated to the first 10
     * characters.
     * The phone number is validated to be exactly 10 characters;
     * otherwise, it is set to the placeholder "5555555555."
     * Similarly, the address is checked for null or blank values and replaced with
     * "NULL" if necessary,
     * while any address longer than 30 characters is truncated to the first 30
     * characters.
     */
    public Contact(String firstName, String lastName, String number, String address) {

        // CONTACTID
        // Contact ID is generated when the constructor is called. It is set as a final
        // variable and has
        // no other getter or setter so there should be no way to change it.
        // The idGenerator is static to prevent duplicates across all contacts.
        this.contactID = String.valueOf(idGenerator.getAndIncrement());

        // FIRSTNAME
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "NULL";
            // If first name is longer than 10 characters, just grab the first 10 characters
        } else if (firstName.length() > 10) {
            this.firstName = firstName.substring(0, 10);
        } else {
            this.firstName = firstName;
        }

        // LASTNAME
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "NULL";
        } else if (lastName.length() > 10) {
            this.lastName = lastName.substring(0, 10);
        } else {
            this.lastName = lastName;
        }

        // NUMBER
        if (number == null || number.isEmpty() || number.length() != 10) {
            this.number = "5555555555";
        } else {
            this.number = number;
        }

        // ADDRESS
        if (address == null || address.isEmpty()) {
            this.address = "NULL";
        } else if (address.length() > 30) {
            this.address = address.substring(0, 30);
        } else {
            this.address = address;
        }
    }

    // GETTERS
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    // SETTERS
    /*
     * The setters follow the same rules as the constructor.
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "NULL";

            // If first name is longer than 10 characters, just grab the first 10 characters
        } else if (firstName.length() > 10) {
            this.firstName = firstName.substring(0, 10);
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "NULL";
        } else if (lastName.length() > 10) {
            this.lastName = lastName.substring(0, 10);
        } else {
            this.lastName = lastName;
        }
    }

    public void setNumber(String number) {
        if (number == null || number.isEmpty() || number.length() != 10) {
            this.number = "5555555555";
        } else {
            this.number = number;
        }
    }

    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            this.address = "NULL";
        } else if (address.length() > 30) {
            this.address = address.substring(0, 30);
        } else {
            this.address = address;
        }
    }

}
